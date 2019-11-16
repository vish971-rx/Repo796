package module2;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter number");
String s=sc.next();
int n=s.length();
System.out.println("length ="+n);
sc.close();
	}
}