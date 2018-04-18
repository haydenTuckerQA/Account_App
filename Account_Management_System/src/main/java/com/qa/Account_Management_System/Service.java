package com.qa.Account_Management_System;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Account> accounts;
	
	public Service() {
		super();
		this.accounts = new HashMap<Integer, Account>();
	}
	
	public void addAccount (Account account) {
		this.accounts.put(account.getAccountNumber(), account);
	}
	
	public Account retrieveAccount (int accountNumber) {
		return this.accounts.get(accountNumber);
	}

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}
}

