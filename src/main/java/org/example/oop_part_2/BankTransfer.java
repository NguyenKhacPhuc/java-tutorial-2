public  class BankTransfer extends PaymentMethod{
    private String accountNumber;
    private String routingNumber;

    
    public BankTransfer(String accountNumber, String routingNumber) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNUmber(String accountNumber)
    {
        if(this.accountNumber != null)
        {
            this.accountNumber = accountNumber;
        }
        else
        {
              System.out.println("Invalid account number ");
        }
    }

    public String getRoutingNumber() {
        return routingNumber;
    }
    public void setRoutingNumber(String routingNumber) 
    {
        if(this.routingNumber != null)
        {
            this.routingNumber = routingNumber;
        }
        else
        {
              System.out.println("Invalid  routing number");
        }
    }
    public void processPayment(double amount)
    {
        System.out.println("Bank transfer : "   + amount);
    }
    public String toString()
    {
        return "Bank Account Number : " + accountNumber + " Routing NUmber : " + routingNumber;
    }
}
