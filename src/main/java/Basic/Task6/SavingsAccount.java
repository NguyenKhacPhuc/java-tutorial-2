package Basic.Task6;

public class SavingsAccount extends BankAccount {
    private float interestRate;
    private int day;

    public SavingsAccount(String accountNumber, float balance, float interestRate, int day) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.day = day;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Invalid");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0) {
            this.day = day;
        } else {
            System.out.println("Invalid");
        }
    }

    public float savingsInterestRate() {
        return getBalance() * (getInterestRate() / 100) * ((float) getDay() / 365);
    }
}
