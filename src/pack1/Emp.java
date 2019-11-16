package pack1;

public class Emp {
	private int eno;
	private String ename;
	private double salary;
	public Emp(int eno, String ename, double salary) {
		
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
