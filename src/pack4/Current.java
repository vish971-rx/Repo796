package pack4;

public class Current extends Account 
{
	private int creditLimit;
public Current(int accountNumber, String accountType, double accountBalance,int creditLimit) {
		super(accountNumber, accountType, accountBalance);
		this.creditLimit=creditLimit;// TODO Auto-generated constructor stub
	}
@Override
public String toString() {
	return "Current [creditLimit=" + creditLimit + ", accountNumber=" + accountNumber + ", accountType=" + accountType
			+ ", accountBalance=" + accountBalance + "]";
}




}
