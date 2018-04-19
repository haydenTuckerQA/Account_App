package com.qa.Account_Management_System;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	private Account hayden;
	private Account ryan;
	private Account hugh;
	
	@Before
	public void initialize() {
		hayden = new Account("Hayden", "Tucker");
		ryan = new Account("Ryan", "Prince");
		hugh = new Account("Hugh", "Grierson");
	}

	@Test
	public void testAccountUniqueID() {
		assertTrue((hayden.getAccountNumber() != ryan.getAccountNumber()) && 
				   (hayden.getAccountNumber() != hugh.getAccountNumber()) &&
				   (ryan.getAccountNumber() != hugh.getAccountNumber()));
	}

}
