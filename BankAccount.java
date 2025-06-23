abstract class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;


    public BankAccount(int accountNumber, String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = balance;
    }


    public BankAccount(int accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0.0;
    }

    abstract double calculateInterest(double balance);

    public final void displayAccountDetails(){
        System.out.println( accountHolderName + "\nAccountNumber :" +accountNumber);
    };


    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }


    public double getAccountBalance(){
        return accountNumber;
    }


    public String toString(){
        return "Bank Receipt " + accountNumber + "\n" + accountBalance;
    }

}