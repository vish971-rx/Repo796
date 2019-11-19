package java_prog;

import java.util.Scanner;
public class UserChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String ch=sc.next();

switch(ch)
{
case "1":
	System.out.println("you are in block 1");
	break;
case "2":
	System.out.println("you are in block 2");
	break;
}
sc.close();

	}

}
