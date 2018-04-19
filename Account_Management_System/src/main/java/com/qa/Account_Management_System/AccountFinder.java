package com.qa.Account_Management_System;

import java.util.Map;

public class AccountFinder {
	public int findAmountByFirstNameIterator (String firstName, Map<Integer, Account> accounts) {
		int count = 0;
		for (Account account : accounts.values()) {
			if (account.getFirstName().equals(firstName)) {
				count++;
			}
		}
		System.out.println("There are " + count + " accounts with the first name " + firstName + ".");
		return count;
	}
}
