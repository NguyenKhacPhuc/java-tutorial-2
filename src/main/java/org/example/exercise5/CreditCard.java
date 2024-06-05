package org.example.exercise5;

public class CreditCard extends PaymentMethod {

    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard with " + getCardNumber() + "/" + getExpirationDate() + "/" + getCvv() + " has payment amount: " + amount);
    }
}
