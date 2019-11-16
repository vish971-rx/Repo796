package module2;

public class EmployeeDetails {
int eno;
String ename;
double salary;
	
	EmployeeDetails()
	{
		eno=0;
		ename="";
		salary=0.0;
	}
	EmployeeDetails(int eno,String ename,double salary)
	{
		this.eno=eno;
		this.ename=ename;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("employee id is:"+eno);
		System.out.println("name is:"+ename);
		System.out.println("salary is:"+salary);
	}
}
