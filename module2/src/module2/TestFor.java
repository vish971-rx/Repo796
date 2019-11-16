package module2;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for (int i=1;i<=10;i++)
//	System.out.println(i+"\n");
	/*int i=10;
	int j=20;
	if(i<j)
		System.out.println("i is less than j");
	else if(i > j)
		System.out.println("j is less than i ");
	else
		System.out.println("same");
	
		*/
		int i=10;
		String s="roar";
		int j=10;
		if((i<20) & (s.equals("hunt")))  
			System.out.println("both the conditions are true");
		else if(s.equals("roar"))
			System.out.println("not matched");
		System.out.println("outside if condition");
		
	}

}
