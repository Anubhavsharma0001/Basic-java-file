package com.JavaInOneVideo.Encapsulation;

public class Bank_Encapsulation {

    private long account_name;

    private double balance ;


    public void deposit (double amount)

    {
        if ( amount > 0)
        {
            balance += amount ;
            System.out.println("Deposited "+ amount);
        }
        else
        {
            System.out.println("Invalid Deposit");
        }


    }

    public void withdraw (double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -=amount;
            System.out.println("Withdrew " + amount );
        }
        else
        {
            System.out.println("Invalid Amount ");
        }


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccount_name() {
        return account_name;
    }

    public void setAccount_name(long account_name) {
        this.account_name = account_name;
    }
}
