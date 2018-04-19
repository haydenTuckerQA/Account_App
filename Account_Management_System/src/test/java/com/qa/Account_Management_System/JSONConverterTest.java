package com.qa.Account_Management_System;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JSONConverterTest {
	private Account testAccount;
	private Service service;
	
	@Before
	public void initialise () {
		testAccount = new Account("Test", "Account");
        service = new Service();
        service.addAccount(testAccount);
	}

	@Test
	public void testConvertMapToJSON() {
		String expected = "{\"" + testAccount.getAccountNumber() + 
				"\":{\"firstName\":\"Test\",\"lastName\":\"Account\",\"accountNumber\":" + testAccount.getAccountNumber() + "}}";
        String result = JSONConverter.convertToJSON(service.getAccounts());
        
        assertEquals(expected, result);
	}

}
