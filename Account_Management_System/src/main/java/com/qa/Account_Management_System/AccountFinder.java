package com.qa.Account_Management_System;

import java.util.Map;

public class AccountFinder {
	public int findFirstNameCount (String firstName, Map<Integer, Account> accounts) {
		return (int)accounts.values().stream().filter(account -> firstName.equals(account.getFirstName())).count();
	}
}
