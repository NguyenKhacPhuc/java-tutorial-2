public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount + "New balance: " + balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void WidthDraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("You widthdraw" + amount + "your new balance is " + balance);
        } else {
            System.out.println("Invalid widthdraw");
        }
    }
}
