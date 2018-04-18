package com.qa.Account_Management_System;

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
        
        System.out.println(JSONConverter.convertMapToJSON(service.getAccounts()));
    }
}
