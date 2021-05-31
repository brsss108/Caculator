package com.naver.dbsxodud01.Operator;

public abstract class ABS_Calculer extends ABS_CalMember
{
	public abstract int getPriority();
	public abstract NumOperand task(NumOperand num1, NumOperand num2);
}

class REF_Oper_43 extends ABS_Calculer
{
	@Override public int getPriority() { return 0; }
	@Override public NumOperand task(NumOperand num1, NumOperand num2)
	{ return new NumOperand((num1.getValue()).add( num2.getValue())); }
	@Override public String toString() { return "+"; }
}
class REF_Oper_45 extends ABS_Calculer
{
	@Override public int getPriority() { return 0; }
	@Override public NumOperand task(NumOperand num1, NumOperand num2)
	{ return new NumOperand((num1.getValue()).subtract (num2.getValue())); }
	@Override public String toString() { return "-"; }
}
class REF_Oper_42 extends ABS_Calculer
{
	@Override public int getPriority() { return 1; }
	@Override public NumOperand task(NumOperand num1, NumOperand num2)
	{ return new NumOperand((num1.getValue()). multiply (num2.getValue())); }
	@Override public String toString() { return "*"; }
}
class REF_Oper_47 extends ABS_Calculer
{
	@Override public int getPriority() { return 1; }
	@Override public NumOperand task(NumOperand num1, NumOperand num2)
	{ return new NumOperand((num1.getValue()). divide (num2.getValue())); }
	@Override public String toString() { return "/"; }
}
class REF_Oper_37 extends ABS_Calculer
{
	@Override public int getPriority() { return 1; }
	@Override public NumOperand task(NumOperand num1, NumOperand num2)
	{ return new NumOperand((num1.getValue()) .remainder(num2.getValue())); }
	@Override public String toString() { return "%"; }
}