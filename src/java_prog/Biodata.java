package java_prog;

import java.util.Scanner;

public class Biodata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name:");
String s=sc.next();
System.out.println("enter age:");
	int age=sc.nextInt();
	System.out.println("enter salary:");
	double salary=sc.nextDouble();
	if(age>18)
		System.out.println("Eligible to vote");
	else
		System.out.println("Not eligible to vote ");
	System.out.println("Name "+s+"\t"+"Age "+age+"\t"+"Salary "+salary);

}
}
