package pack4;

public class Savings extends Account{
boolean isSalaried=true;
public Savings(int accountNumber,String accountType,double accountBalance,boolean isSalaried) 
{
	super(accountNumber,accountType,accountBalance);
	this.isSalaried = isSalaried;
}
@Override
public String toString() {

	return "Savings [isSalaried=" + isSalaried + ", accountNumber=" + accountNumber + ", accountType=" + accountType
			+ ", accountBalance=" + accountBalance + "]";
}
//if(isSalaried==true)
	//sysout
public void check()
{
	if(isSalaried==true)
		System.out.println("abcdr");
	else
		System.out.println("hhhhhh");
}

}


