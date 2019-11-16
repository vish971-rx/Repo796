package java_prog;
import java.util.Scanner;

class Circle
{

	public int area(int x)
	{
		int a=(int)3.14*x*x;
	return(a);

}
}
public class TestCircle {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	Circle c=new Circle();
	System.out.println("enter radius:");
	int r=sc.nextInt();
	System.out.println("area is :"+c.area(r));// TODO Auto-generated method stub
sc.close();
	}

}
