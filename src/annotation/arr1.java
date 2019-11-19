package annotation;

class New
{
	@Deprecated
	public void method1()
	{
		System.out.println("check for annoation");
	}
	//new method
	public void newmethod1()
	{
		System.out.println("phone kharab hogya tmara");
	}
}
public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
New ob=new New();
ob.newmethod1();
	}

}
