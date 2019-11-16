package multithreading;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcitest {

	@Test
	public void testAdd() {
		Calculator ob1=new Calculator();
		//fail("Not yet implemented");
		int a=100,b=200;
		int actual=ob1.add(a, b);
		int expected=300;
		assertEquals(expected,actual);
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");
		Calculator ob1=new Calculator();
		//fail("Not yet implemented");
		int a=100,b=50;
		int actual=ob1.sub(a, b);
		int expected=-50;
		assertEquals(expected,actual);
	}

}
