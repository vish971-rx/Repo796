package pack6;

public class Emp {

	 int empId;
	 String ename;
	double sal;
	public Emp(int empId, String ename,double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal=sal;
	}
	public boolean checkName(String ename)
	{
		char[] chars=ename.toCharArray();
		int flag=0;//convert string into array of character
		for(char c:chars) //checking for each character
		{
			if((c>=65 && c<=90) || (c>=97 && c<=122))
			{
				flag=1;
			}
			//		return false;
		}
		if(flag==1)
		return true;
		else
			return false;
	}
}
	

