package module2;

public class TestHdfc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hdfc1 ob=new Hdfc1();  //will call the default constructor
	ob.display();
	
	Hdfc1 ob2=new Hdfc1(1223,"hopper",66666);  //will call the parameterized constructor	
	ob2.display();

	ob.display();

			Hdfc1 ob4=new Hdfc1();

					Hdfc1 ob5=new Hdfc1();
	//System.out.println(ob);
	//System.out.println(ob2);
	System.out.println("calling static method and ans is "+(Hdfc1.getcounter()));
	}

}
