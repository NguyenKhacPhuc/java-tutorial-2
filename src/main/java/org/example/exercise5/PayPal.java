package org.example.exercise5;

public class PayPal extends PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        setEmail(this.email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email!=null) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal with " + getEmail() + "/" + getPassword() + " has payment amount: " + amount);
    }
}
