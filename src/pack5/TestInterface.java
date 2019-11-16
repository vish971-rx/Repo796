package pack5;
interface Animal1
{
	void sound();
}
class Dog1 implements Animal1
{
	public void sound()
	{
		System.out.println("bhau bhau");
	}
}
class Lion1 implements Animal1
{
	public void sound()
	{
		System.out.println("srarrararrararar....");
	}
}
public class TestInterface 
{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
Dog1 d=new Dog1();
//d.classInfo("dog");
d.sound();
Lion1 l=new Lion1();
//l.classInfo("lion");
l.sound();

}

}
