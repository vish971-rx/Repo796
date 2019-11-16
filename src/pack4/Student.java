package pack4;

public class Student extends Person {

	private int rollno;
	private char grade;
	private String stream;
	
	 public Student(char gender,int age,String name,int rollno,char grade,String stream)
	{
		 super(gender,age,name); //to call constructor of parent class;
		 this.rollno=rollno;
		 this.grade=grade;
		 this.stream=stream;
    }

	@Override
	public String toString() {
		return super.toString()+"Student [rollno=" + rollno + ", grade=" + grade + ", stream=" + stream + "]";
	}
	 
	 }

