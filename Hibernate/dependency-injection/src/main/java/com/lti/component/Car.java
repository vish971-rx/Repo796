package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("cr")
public class Car {
@Autowired	//Dependency injection
	private AudioSystem audiosystem;
	
	public void playMusic()
	{
		
		audiosystem.playFM(98.3);
	}

}
