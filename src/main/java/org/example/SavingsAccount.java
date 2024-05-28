package org.example;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate must be larger than 0");
        }
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        depositMoney(interest);
        System.out.println("Interest: $" + interest);
        System.out.println("New Balance : $" + getBalance());
    }
}
