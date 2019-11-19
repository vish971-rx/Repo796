package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("text")
public class TextEditor {
@Autowired
	private SpellCheck sc; 
	public void load(String document)
	{
		System.out.println(" this is text editor loading "+document);
		sc.checkSpellingMistakes(document);
	}
}
