package eg;

public class SingleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100,b=10,res;
try
{
	res=a/b;
//	System.out.println("result="+res);
}
catch (ArithmeticException e)
{
	System.out.println("cannot divide by zero");
	System.out.println(e.getMessage()); //1
	System.out.println(e);//2
	e.printStackTrace();//3
}
finally
{
	System.out.println("finally block");
}

	}

}
