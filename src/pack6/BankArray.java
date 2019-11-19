package pack6;

public class BankArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount bankArr[]=new BankAccount[5]; //shorter  code..only one object..
bankArr[0]=new BankAccount();
bankArr[1]=new BankAccount();
bankArr[2]=new BankAccount();
bankArr[3]=new BankAccount();
bankArr[4]=new BankAccount();


bankArr[0].setBankAccount(1, "neil", 1000);
bankArr[1].setBankAccount(2, "nitin", 2000);
bankArr[2].setBankAccount(3, "mukesh", 3000);
bankArr[3].setBankAccount(4, "varsha", 4000);
bankArr[4].setBankAccount(5, "sudu", 5000);
for(int i=0;i<bankArr.length;i++)
	{
	bankArr[i].showBankAccount();
	}
	}

}
