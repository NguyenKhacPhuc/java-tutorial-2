package org.example;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    public void depositMoney(double depositMoney){
        if (depositMoney > 0) {
            balance += depositMoney;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdrawMoney (double withdrawMoney){
        if (withdrawMoney > 0 && withdrawMoney <= balance) {
            balance -= withdrawMoney;
        } else {
            System.out.println("Withdraw amount must be positive");
        }
    }
}
