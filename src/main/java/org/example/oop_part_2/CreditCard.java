import java.util.*;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private int cvv;

    public CreditCard(String cardNumber, String expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (this.cardNumber != cardNumber) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid cardNumber");
        }
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        if (this.expirationDate != null) {
            this.expirationDate = expirationDate;
        }
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        if (this.cvv != 0) {
            this.cvv = cvv;
        } else {
            System.out.println("Invalid cvv");
        }
    }

    public void processPayment(double amount) {
        System.out.println("Infot about credit card: " + amount);
    }

    public String toString() {
        return cardNumber + " " + expirationDate + " " + cvv;
    }

}
