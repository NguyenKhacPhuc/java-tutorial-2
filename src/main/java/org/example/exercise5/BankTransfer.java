package org.example.exercise5;

public class BankTransfer extends PaymentMethod {
    private String accountNumber;
    private String routingNumber;

    public BankTransfer(String accountNumber, String routingNumber) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("BankTransfer with " + getAccountNumber() + "/" + getRoutingNumber() + " has payment amount: " + amount);
    }
}
