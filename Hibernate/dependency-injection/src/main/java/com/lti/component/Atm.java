package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("atm")
public class Atm implements AtmInterface {
@Autowired
private BankInterface bank;
/* (non-Javadoc)
 * @see com.lti.component.AtmInterface#requestWithdraw(double)
 */
public void requestWithdraw(double amount)
{
	System.out.println("amount requested for withdrawing is : "+ amount);
	bank.grantRequest(amount);
}
}
