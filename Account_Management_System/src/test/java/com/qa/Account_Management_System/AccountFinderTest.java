package com.qa.Account_Management_System;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountFinderTest {
	private Account testAccount1;
	private Account testAccount2;
	private Account testAccount3;
	private Service service;
	private AccountFinder accountFinder;
	
	@Before
	public void initialise() {
		testAccount1 = new Account("Hayden", "Tucker");
		testAccount2 = new Account("Ryan", "Prince");
		testAccount3 = new Account("Hayden", "Tucker");
        service = new Service();
        service.addAccount(testAccount1);
        service.addAccount(testAccount2);
        service.addAccount(testAccount3);
        accountFinder = new AccountFinder();
	}

	@Test
	public void testFindAmountByFirstNameIterator() {
		int expectedValue = 0;
		int actualValue = accountFinder.findFirstNameCount("does-not-exist", service.getAccounts());
		Assert.assertEquals(expectedValue, actualValue);
		
		expectedValue = 2;
		actualValue = accountFinder.findFirstNameCount("Hayden", service.getAccounts());
		Assert.assertEquals(expectedValue, actualValue);
	}

}
