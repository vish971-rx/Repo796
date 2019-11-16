package module2;
import java.util.Scanner;
public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[][]=new int[5][5];

Scanner sc=new Scanner(System.in);

System.out.println("enter employee id and salary:");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
		ar[i][j]=sc.nextInt();
	}
}
System.out.println("result is");
for(int i=0;i<2;i++)
{
	for(int j=0;j<2;j++)
	{
	System.out.print(ar[i][j]+" ");
	}
	System.out.println();
}

	}

}
