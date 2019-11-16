package module2;

//import java.util.Scanner;

public class Hdfc1 {

	
	private int accountNumber;
	private String accountHoldername;
	private double accountBalance;
	private static int counter1=0;
	public Hdfc1()  //default constructor
	{
		System.out.println("default constructor");
		accountNumber=0;
		accountHoldername="";
		 accountBalance=0.0;
		 counter1++;
	}
	
	public Hdfc1(int accountNumber,String accountHoldername,double accountBalance)
	
	{
		System.out.println("paramaterised constructor");
this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
	this.accountHoldername=accountHoldername;
	//counter1++;
	}
	public static int getcounter()
	{
		return counter1;
	}
	
	public void display()
	{
		System.out.println("account number is:"+accountNumber);
		System.out.println("name is:"+ accountHoldername);
		System.out.println("balance is:"+ accountBalance);
	System.out.println("records are:"+counter1);
	}
	public void withdraw(double d)
	{
		if(accountBalance-d>0)
		{
			System.out.println("remaining amount is:"+(accountBalance-d));
		
	accountBalance=accountBalance-d;
		}
	}
	public void deposit(double d)
	{
		if(d>0)
		{System.out.println("remaining amount is:"+(accountBalance+d));
		accountBalance=accountBalance+d;
		}
	}
//	public String toString()
//	{
//		return accountNumber+" "+accountHoldername+" "+ accountBalance;
//	}
	
	
}
