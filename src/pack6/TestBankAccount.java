package pack6;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount ob=new  BankAccount();
		 BankAccount ob2=new  BankAccount();
		 ob.setBankAccount(10, "abc", 10.0);
		 ob2.setBankAccount(12, "efg", 12.0);
		 ob.showBankAccount();
		 ob.deposit(1000);
		 ob.showBankAccount();
		 //ob.transfer(ob2,500 );
		 ob.showBankAccount();
		 ob2.showBankAccount();
		 FundTransferService fts=new FundTransferService();
		 fts.transferamt(ob, ob2, 50);
		 ob.showBankAccount();
		 ob2.showBankAccount();
	}

}
