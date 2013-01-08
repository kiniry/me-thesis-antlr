grammar TemplateTestWalker;
//tree grammar TemplateTestWalker;

options {
//  tokenVocab=TemplateTest;
  ASTLabelType=CommonTree;
}

@header {
  package bytecodeDeobfuscation;
}

rule1: rule2+;
rule2: 
     id=IDENTIFIER {System.out.println("Id: '"+$id.text+"'");}
   | INT {System.out.println("Int: '"+$INT.text+"'");};