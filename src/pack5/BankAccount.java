package pack5;

 abstract class BankAccount {
	private int id;
	protected float balance;
	BankAccount(int id,float balance)
	{
		this.id=id;
		this.balance=balance;
		
	}
 abstract float calculateInterest();

}
