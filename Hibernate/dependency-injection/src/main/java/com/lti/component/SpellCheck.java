package com.lti.component;

import org.springframework.stereotype.Component;

@Component("spell")
public class SpellCheck {

	public void checkSpellingMistakes(String document)
	{
		System.out.println("spellchecker executed for "+ document);
}
}
