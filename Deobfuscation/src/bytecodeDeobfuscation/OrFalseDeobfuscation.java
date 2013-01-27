package bytecodeDeobfuscation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

public class OrFalseDeobfuscation {
	public static final int Code=32;

	private TreeAdaptor adaptor = new CommonTreeAdaptor();
	
	public CommonTree FindSubtreeToRemove(CommonTree tree)
	{
		for(int j = 0; j < tree.getChildCount(); j++){
			CommonTree child = (CommonTree)tree.getChild(j);
			if(child.getText() == "INSTRUCTION"){
				RemoveSubtree(child);
			}
			else{
				FindSubtreeToRemove(child);	
			}
		}
		return tree;
	}

	public CommonTree RemoveSubtree(CommonTree tree)
	{
		for(int i = 0; i < tree.getChildCount(); i++){
			if(tree.getChild(i).getText().equals("iconst_0") && tree.getChild(i+1).getText().equals("ifeq")){
				tree.deleteChild(i);
				tree.deleteChild(i);
				ChangeProgramCounter(tree, i);
				break;
			}
		}
		return tree;
	}
	
	private CommonTree ChangeProgramCounter(CommonTree tree, int pcIndex){
		CommonTree child = (CommonTree)tree.getChild(pcIndex);
		int threshold = Integer.parseInt(child.getChild(0).getText());
		for(int i = pcIndex; i < tree.getChildCount();i++){
			CommonTree codeLine = (CommonTree)tree.getChild(i);
			int pc = Integer.parseInt(codeLine.getChild(0).getText())-4;
			Object o = adaptor.create(JVMPrettyPrinter.INTLITERAL, pc+"");
			codeLine.replaceChildren(0, 0, o);
		}
		ReplaceGotos(tree, threshold);
		return tree;
	}
	
	private CommonTree ReplaceGotos(CommonTree tree, int threshold)
	{
		for(int i = 0; i < tree.getChildCount();i++){
			CommonTree codeLine = (CommonTree)tree.getChild(i);
			switch(codeLine.getText())
			{
				case "if_acmpeq": 
				case "if_acmpne": 
				case "if_icmpeq": 
				case "if_icmpne": 
				case "if_icmplt": 
				case "if_icmpge": 
				case "if_icmpgt": 
				case "if_icmple": 
				case "ifeq": 
				case "ifne": 
				case "iflt": 
				case "ifge": 
				case "ifgt": 
				case "ifle": 
				case "ifnonnull": 
				case "ifnull": 
				case "jsr": 
				case "goto": 
				case "jsr_w":
				case "goto_w":
					ReplaceGoto(codeLine, threshold);
					break;
			}
		}
		return tree;
	}
	
	private void ReplaceGoto(CommonTree codeLine, int threshold){
		for(int i = 0; i < codeLine.getChildCount();i++){
			CommonTree child = (CommonTree)codeLine.getChild(i);
			if(child.getText().equals("OPERAND") && child.getChildCount() > 0){
				CommonTree childchild = (CommonTree)child.getChild(0);
				int pc = Integer.parseInt(childchild.getText()) - 4;
				Object o = adaptor.create(JVMPrettyPrinter.INTLITERAL, pc+"");
				child.replaceChildren(0, 0, o);
			}
		}
	}
	
	public CommonTree ChangeTree(HashMap<CommonTree, ArrayList<OrFalseReduction.CodeLine>> list){
		CommonTree ret = null;
		for(CommonTree codeblock : list.keySet()){
			System.out.println(codeblock.toStringTree());
			int index = RemoveNodes(codeblock);
			
			if(index >= 0){
				for(OrFalseReduction.CodeLine line : list.get(codeblock)){
					ChangeProgramCounter(line, index);
					ChangeBranches(line, index);
				}
			}
			System.out.println(codeblock.toStringTree());
			if(ret == null)
				ret = (CommonTree)codeblock.getAncestor(22).getParent();
		}
		return ret;
	}
	private void ChangeProgramCounter(OrFalseReduction.CodeLine line, int changeIndex){
		if(changeIndex <= line.pc){
			Object o = adaptor.create(JVMPrettyPrinter.INTLITERAL, line.pc-4+"");
			line.token.replaceChildren(0, 0, o);
		}
	}
	private void ChangeBranches(OrFalseReduction.CodeLine line, int changeIndex){
		if(isBranch(line.token.getText())){
			for(CommonTree op : line.operands){
				int pc = Integer.parseInt(op.getText());
				if(changeIndex <= pc){
					Object o = adaptor.create(JVMPrettyPrinter.INTLITERAL, pc-4+"");
					op.parent.replaceChildren(op.childIndex, op.childIndex, o);
				}
			}
		}
	}

	public int RemoveNodes(CommonTree tree)
	{
		for(int i = 0; i < tree.getChildCount(); i++){
			if(tree.getChild(i).getText().equals("iconst_0") && tree.getChild(i+1).getText().equals("ifeq")){
				tree.deleteChild(i);
				tree.deleteChild(i);

				CommonTree child = (CommonTree)tree.getChild(i);
				return Integer.parseInt(child.getChild(0).getText());
			}
		}
		return -1;
	}
	
	private boolean isBranch(String instruction)
	{
		switch(instruction)
		{
			case "if_acmpeq": 
			case "if_acmpne": 
			case "if_icmpeq": 
			case "if_icmpne": 
			case "if_icmplt": 
			case "if_icmpge": 
			case "if_icmpgt": 
			case "if_icmple": 
			case "ifeq": 
			case "ifne": 
			case "iflt": 
			case "ifge": 
			case "ifgt": 
			case "ifle": 
			case "ifnonnull": 
			case "ifnull": 
			case "jsr": 
			case "goto": 
			case "jsr_w":
			case "goto_w":
				return true;
		}
		return false;
	}
}
