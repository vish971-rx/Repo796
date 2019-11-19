package module2;

class Dog
{
String breed;
int size;
String name;
void bark()
{
	System.out.println("barking...");
	System.out.println(breed);

}
public String toString()
{
	return breed+" "+size+" "+ name;
}

}
public class Testdog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog ob=new Dog(); //object of dog class
ob.breed="husky";
ob.size=100;
ob.name="jackson";

ob.bark(); 
Dog d=new Dog();//calling another method
d.breed="shitzu";
d.size=10;
d.name="gatsby";
d.bark();

System.out.println(d);


	}

}
