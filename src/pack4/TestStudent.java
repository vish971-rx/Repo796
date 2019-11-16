package pack4;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("creating an object of person class");
		Person p=new Person('v',30,"varsha"); //calls constructor
		System.out.println(p); //will call toString();

		System.out.println("------------");
		System.out.println("creating an object of student class");
		Student s1=new Student('v',30,"varsha",100,'A',"cs");
		System.out.println(s1);
		
	}

}
