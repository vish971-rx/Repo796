package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cc") //alternative to <bean id="" class="..">
public class CurrencyConverter implements CurrencyConverterInterface {
	
	
	
	/* (non-Javadoc)
	 * @see com.lti.component.CurrencyConverterInterface#dollarsToRupee(double)
	 */
	public double dollarsToRupee(double dollars)
	{
		return dollars*71.56;
		
	}

}
