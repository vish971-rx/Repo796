package com.lti.component;

public class DummyCalculator implements DummyCalculatorInterface {

	
	public int calcuAdd(int a,int b)
	{
		return a+b;
		
	}
	public int calcuSub(int a,int b)
	{
		return a-b;
		
	}
	public int calcuMul(int a,int b)
	{
		return a*b;
		
	}
	public int calcuDiv(int a,int b)
	{
		return a/b;
		
	}
}