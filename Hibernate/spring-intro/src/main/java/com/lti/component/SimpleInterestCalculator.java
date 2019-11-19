package com.lti.component;

import org.springframework.stereotype.Component;

@Component("si")
public class SimpleInterestCalculator implements SimpleInterestInterface {
	/* (non-Javadoc)
	 * @see com.lti.component.SimpleInterestInterface#simpleInterest(double, double, int)
	 */
	public double simpleInterest(double p,double r,int t)
	{
		return (p*r*t)/100;
	}

}
