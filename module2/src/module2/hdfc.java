package module2;
import java.util.Scanner;


class testHdfc{

	private int accountNumber;
	private String accountHoldername;
	private double accountBalance;
	Scanner sc=new Scanner(System.in);// TODO Auto-generated method stub
	
	public void acceptDetails()
	{
		System.out.println("enter account number");
		accountNumber=sc.nextInt();
		System.out.println("enter name:");
		accountHoldername=sc.next();
		System.out.println("enter balance:");
		accountBalance=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("account number is:"+accountNumber);
		System.out.println("name is:"+ accountHoldername);
		System.out.println("balance is:"+ accountBalance);
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
	
}
public class hdfc {

	public static void main(String[] args) {

		Scanner scb=new Scanner(System.in);
		testHdfc ob=new testHdfc();
		ob.acceptDetails();
		ob.display();
		System.out.println("enter withdrawl amount:");
		double e=scb.nextDouble();
		ob.withdraw(e);
		System.out.println("enter deposit amount:");
	double f=scb.nextDouble();
	ob.deposit(f);
	}
	}
