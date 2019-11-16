package pack5;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CurrentAccount c=new CurrentAccount(123,7893f);
LoanAccount l=new LoanAccount(126,1234f);
SavingsAccount s=new SavingsAccount(124,1234f);
System.out.println(s.calculateInterest());
System.out.println(l.calculateInterest());
System.out.println(c.calculateInterest());
	}

}
