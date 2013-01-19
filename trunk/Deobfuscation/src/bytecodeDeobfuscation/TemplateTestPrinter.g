tree grammar TemplateTestPrinter;

options {
  tokenVocab = TemplateTest;
  output = template;
    ASTLabelType = CommonTree;
}

@header {
  package bytecodeDeobfuscation;
}

rule1	: (s+=rule2)+	-> list(l={$s})
	;
rule2	: (r3v=rule3	-> r3(f={$r3v.st})
	| r4v=rule4	-> r4(f={$r4v.st})
	| r5v=rule5	-> r4(f={$r5v.st})
	)
	;
rule3	: i1=INT i2=INT	//-> ii(f={$i1.text}, s={$i2.text})
	;
rule4	: IDENTIFIER INT//-> ti(f={$IDENTIFIER.text}, s={$INT.text})
	;
rule5	: id1=TOKEN (id2+=IDENTIFIER)+
			//-> tl(f={$id1.text}, s={$id2})
	;
//rule2	: id=IDENTIFIER	-> id(i={$id.text})
//	| in=INT	-> int(i={$in.text})
//	;