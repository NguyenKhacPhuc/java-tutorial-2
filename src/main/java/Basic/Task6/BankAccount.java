package Basic.Task6;

public class BankAccount {
    private String accountNumber;
    private float balance;

    public BankAccount(String accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("^[a-zA-Z0-9 ]*$") && accountNumber.equals(accountNumber.trim())) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid");
        }
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public float sendMoney(float deposits) {
        if (deposits > 0) {
            return balance + deposits;
        } else {
            return balance;
        }
    }

    public float withdrawMoney(float withdrawal) {
        if (withdrawal <= balance) {
            return balance - withdrawal;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
