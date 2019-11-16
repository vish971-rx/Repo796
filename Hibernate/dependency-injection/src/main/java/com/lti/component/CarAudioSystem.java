package com.lti.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarAudioSystem {
public static void main(String args[])
{
	ApplicationContext ctx=
			new ClassPathXmlApplicationContext("dependency-config.xml");
	Car ob=(Car)ctx.getBean("cr");
	//System.out.println("");
	ob.playMusic();
}
}
