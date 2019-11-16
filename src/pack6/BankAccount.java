package pack6;

public class BankAccount {
	private int accNo;
	private String accName;
	private double accBal;
	void setBankAccount (int a,String b,double c)
	{
		accNo=a;
		accName=b;
		accBal=c;
	}
	void showBankAccount()
	{
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBal);
	}
	void withdraw(double amt)

	{
		System.out.println("balance after withdrawing");
		accBal=accBal-amt;
		System.out.println(accBal);
	}
	void deposit(double amt)
	{
		System.out.println("balance after depositing");
		accBal=accBal+amt;
		System.out.println("acc bal is "+accBal);
	}
	//passing an object as a parameter
	void transfer(BankAccount x,double amt)
	{
		System.out.println("transferring the amount");
		withdraw(amt);
		x.deposit(amt);
		System.out.println("transfer done successfully! ");
	}
	
	
	
}
class FundTransferService
{
	void transferamt(BankAccount source,BankAccount dest,double amt)
	{
		System.out.println("fund transfer service initiated..");
		source.withdraw(amt);
		dest.deposit(amt);
		System.out.println("fund transfer completed..");
	}
}

