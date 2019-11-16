package eg;

public class ArrayExEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int[] a={11,22,33};
	System.out.println("the element is "+a[10]);
	
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("element is not existing");
	System.out.println(e);
}
System.out.println("out of block");
	}

}
