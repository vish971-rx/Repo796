package pack4;

public class Account {

	protected int accountNumber;
	protected String accountType;
	protected double accountBalance;
	public Account(int accountNumber, String accountType, double accountBalance) {
		//super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
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
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
}
