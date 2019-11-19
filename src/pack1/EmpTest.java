package pack1;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp ob=new Emp(123,"jon",1250);
System.out.println(ob.getEname());
System.out.println(ob.getEno());
System.out.println(ob.getSalary());
ob.setEname("Tyrion");
ob.setEno(321);
ob.setSalary(123000);
System.out.println("after setting..");
System.out.println(ob.getEname());
System.out.println(ob.getEno());
System.out.println(ob.getSalary());
	}

}
