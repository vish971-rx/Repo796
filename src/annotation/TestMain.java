package annotation;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubClass ob=new SubClass();
ob.display();
	}

}
class Superclass
{
	public void display()
	{
		System.out.println("super display method");
	}
}
class SubClass extends Superclass
{
//	public void display111111()  //error will be there if annotation is given..here override
//	{
//}
	@Override
	public void display()
	{
		System.out.println("display method");
	}
	
}