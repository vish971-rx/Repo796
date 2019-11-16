package pack5;

abstract class Animal {
int legs=4;
abstract void sound();
void classInfo(String info)
{
	System.out.println("i belong to "+ info+" type.");
}

}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("bhau..bhau");
		System.out.println("number of legs are:"+legs);
	}
}
class Lion extends Animal
{
	void sound()
	{
		System.out.println("srarararaar....");
		System.out.println("number of legs are:"+legs);
	}
}