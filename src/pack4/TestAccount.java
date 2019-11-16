package pack4;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Account ob=new Account(123,"Savings",1000);
Savings s=new Savings(123,"Savings",1000,false);
Current c=new Current(123,"Savings",1000,100);
c.withdraw(100);
System.out.println(c);
//System.out.println(s);
if(s.isSalaried==true)
System.out.println(s);
s.check();
	}

}
