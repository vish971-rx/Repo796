package pack4;

class Class1
{
	static {
		System.out.println("static block in class 1");
	}
	public void display()
	{
		System.out.println("display fun without static");
	}
}
public class DemoStaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 ob=new Class1();
		ob.display();

	}

}

//static block gets called automatically