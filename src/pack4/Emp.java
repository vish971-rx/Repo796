package pack4;

public class Emp {
private int empId;
private String ename;
public Emp(int empId, String ename) {
	super();
	this.empId = empId;
	this.ename = ename;
}
@Override
public String toString() {
	return "Emp [empId=" + empId + ", ename=" + ename + "]";
}

}
