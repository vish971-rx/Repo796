package module2;
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String ar[]=new String[5];
for(int i=0;i<5;i++)
	ar[i]=sc.next();

//enhanced for loop
for(String a:ar)
	System.out.println(a);
	}

}
