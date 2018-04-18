package com.qa.Account_Management_System;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ServiceTest {
	Service service;
	Account testAccount;
	
	@Before
	public void initialise () {
		service = new Service();
		testAccount = new Account("Hayden", "Tucker");
	}
	
	
	@Test
	public void testAddAccount() {
		assertTrue(!service.getAccounts().containsKey(testAccount.getAccountNumber()));
		service.addAccount(testAccount);
		assertTrue(service.getAccounts().containsKey(testAccount.getAccountNumber()));
		assertTrue(service.getAccounts().get(testAccount.getAccountNumber()).equals(testAccount));
	}

	@Test
	public void testRetrieveAccount() {
		assertNull(service.retrieveAccount(testAccount.getAccountNumber()));
		service.addAccount(testAccount);
		assertTrue(testAccount.equals(service.retrieveAccount(testAccount.getAccountNumber())));
	}

}
