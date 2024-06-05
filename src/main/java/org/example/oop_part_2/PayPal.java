package org.example.oop_part_2;
public class PayPal extends PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(regex);
    }

    public void setEmail(String email) {
        {
            if (isValidEmail(email)) {
                this.email = email;
            } else {
                System.out.println("Invalid email");
            }
        }

    }

    public String getPassWord() {
        return password;
    }

    private boolean isValidPassWord(String password) {
        return password.matches(".*\\s.*");
    }

    public void setPassWord(String password) {
        if (isValidPassWord(password)) {
            System.out.println("Invalid password");
        } else if (this.password.length() <= 5) {
            System.out.println("Password should be at least 5 characters long");
        } else {
            this.password = password;
        }
    }
    public void processPayment(double  amount)
    {
         System.out.println("PayPal amount: "+amount);
    }
    public String toString()
    {
        return "Email : " + email + " " + " Password " +  password; 
    }
}
