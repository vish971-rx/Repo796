package module2;

import java.util.Scanner;
class Fun
{
	public void add(int a,int b)
     {
		System.out.println(a+b);
}

	public void add(int a,float b)
    {
		System.out.println(a+b);
}

	public void add(float a,float b)
    {
		System.out.println(a+b);
}

}


public class funOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fun ob=new Fun();
	ob.add(5, 1);
	ob.add(26,28.1f);
	ob.add(31.1f, 31.1f);
	
	}

}
