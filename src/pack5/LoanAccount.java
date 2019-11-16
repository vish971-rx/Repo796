package pack5;

public class LoanAccount extends BankAccount {

	public LoanAccount(int id, float balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	float calculateInterest() {
		// TODO Auto-generated method stub
		return balance;
	}
	

}
