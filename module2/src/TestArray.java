
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] list1={"neil","nitin","mukesh","jon","snow"};
String[] list2={"infosys","tcs","lti","seimens","clariant"};
String[] list3={"clustor","data science","mongo","R lang","cassendra"};
int a1=list1.length;
int a2=list2.length;
int a3=list3.length;
int rand1=(int)(Math.random()*a1);
int rand2=(int)(Math.random()*a2);
int rand3=(int)(Math.random()*a3);
String phrase=list1[rand1]+ " "+list2[rand2]+ " "+list3[rand3];
	System.out.println("result is "+phrase);
	}


}

