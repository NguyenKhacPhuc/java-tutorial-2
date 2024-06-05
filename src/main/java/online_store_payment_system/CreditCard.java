package online_store_payment_system;

public class CreditCard extends PaymentMethod {
    private int cardNumber;
    private String expirationDate;
    private int CCV;

    public CreditCard(int cardNumber, String expirationDate, int CCV) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.CCV = CCV;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard: " + amount);
    }
}
