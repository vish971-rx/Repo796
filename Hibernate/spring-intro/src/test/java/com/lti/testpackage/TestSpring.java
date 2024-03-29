package com.lti.testpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.CurrencyConverterInterface;
import com.lti.component.DummyCalculator;
import com.lti.component.DummyCalculatorInterface;
import com.lti.component.HelloDummy;
import com.lti.component.HelloWorld;
import com.lti.component.SimpleInterestInterface;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loading Spring's IoC container
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("spring-config.xml");
		//Access the required object
		HelloDummy h=(HelloDummy)ctx.getBean("hw");
		System.out.println(h.sayHello(" Jon"));
		DummyCalculatorInterface d=(DummyCalculatorInterface)ctx.getBean("cw");
	System.out.println(d.calcuAdd(10, 15));
	CurrencyConverterInterface cci=(CurrencyConverterInterface)ctx.getBean("cc");
	System.out.println("dollar in rupee="+cci.dollarsToRupee(1));
	SimpleInterestInterface si=(SimpleInterestInterface)ctx.getBean("si");
	System.out.println(("simple interest is = ")+si.simpleInterest(1000, 5, 2));
	
	}

}
