package pack5;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(int id, float balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	float calculateInterest() {
		// TODO Auto-generated method stub
		return balance;
	}
	

}
