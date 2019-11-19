package com.lti.component;

import org.springframework.stereotype.Component;

@Component("sbi")
public class SbiBank implements BankInterface {
/* (non-Javadoc)
 * @see com.lti.component.BankInterface#grantRequest(double)
 */
public void grantRequest(double amount)
{
	System.out.println("request granted for transaction");
}
}
