package eg;

public class TestGeneric {
	
	public static <E> void printarray(E[] inputarray)
	{
		for (E element: inputarray)
			System.out.printf("%s",element);
	
	System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] a={10,20,30,40,50};
Double[] b={12.0,3445.9,566.7,678.5,456.0};
Float[] d={12.0f,3445.9f,566.7f,678.5f,456.0f};
Character[] c={'4','d','e','r'};
System.out.println("Elements are:");
printarray(a);
System.out.println("Elements are:");
printarray(b);
System.out.println("Elements are:");
printarray(c);
System.out.println("Elements are:");
printarray(d);
	}

}
