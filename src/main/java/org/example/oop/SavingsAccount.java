public class SavingsAccount extends BankAccount {
    private double rate;

    public SavingsAccount(int accountNumber, double amount, double rate) {
        super(accountNumber, amount);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
