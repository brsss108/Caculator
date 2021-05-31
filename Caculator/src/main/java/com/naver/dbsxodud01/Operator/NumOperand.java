package com.naver.dbsxodud01.Operator;
import java.math.BigInteger;
public class NumOperand extends ABS_CalMember
{
	 BigInteger value;
	public NumOperand( BigInteger v)
	{
		this.value = v;
	}
	public  BigInteger getValue()
	{
	return this.value;
	}
	@Override public String toString() { return String.valueOf(this.value); }
}