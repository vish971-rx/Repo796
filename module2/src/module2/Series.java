package module2;
import java.util.Scanner;
class SeriesDetails
{
	private String name,genre,language;
	SeriesDetails()
	{
		System.out.println("Default constructore values are:\n ");
		name="";
		genre="";
		language="";
		
	}
	SeriesDetails(String name,String genre,String language)
	{
		System.out.println("Paramaterised constructor values are:\n");
		this.name=name;
		this.genre=genre;
		this.language=language;
		
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter genre");
		genre=sc.next();
		System.out.println("Enter language");
		language=sc.next();
	}
	public void display()
	{
		System.out.println("Your chosen details are:");
        System.out.println(name);
        System.out.println(genre);
        System.out.println(language);
	}
	
}





public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String nam,genr,languag;
		System.out.println("Enter name");
		nam=sc.next();
		System.out.println("Enter genre");
		genr=sc.next();
		System.out.println("Enter language");
		languag=sc.next();
		
		SeriesDetails ob1=new SeriesDetails();
		SeriesDetails ob2=new SeriesDetails(nam,genr,languag);
		ob1.display();
		ob2.display();
		
	}

}
