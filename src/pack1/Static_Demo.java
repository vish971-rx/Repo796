package pack1;
class Demo1
{
	private static int counter1=1;
	public void display()
	{
		System.out.println("counter is "+counter1);
	counter1++;
	}
	
	
}

public class Static_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 ob=new Demo1();
		ob.display();
		Demo1 ob2=new Demo1();
		ob2.display();
		Demo1 ob3=new Demo1();
		ob.display();
		

	}

}
