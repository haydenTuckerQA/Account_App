package com.qa.app;

import com.qa.Account_Management_System.Account;
import com.qa.Account_Management_System.JSONConverter;
import com.qa.Account_Management_System.Service;

public class Runner 
{
    public static void main( String[] args )
    {
        Account hayden = new Account("Hayden", "Tucker");
        Account ryan = new Account("Ryan", "Tucker");
        Account hugh = new Account("Hugh", "Tucker");
        
        Service service = new Service();
        
        service.addAccount(hayden);
        service.addAccount(ryan);
        service.addAccount(hugh);
        
        System.out.println(JSONConverter.convertToJSON(service.getAccounts()));
    }
}
