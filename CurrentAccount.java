public class CurrentAccount extends BankAccount{


    public CurrentAccount(int accountNumber,String accountHolderName, double accountBalance){
        super(accountNumber, accountHolderName, accountBalance);
    }

    public double calculateInterest(double accountBalance){
        return accountBalance;
    }


    @Override
    public String toString(){
        return "Bank Receipt " + "\n AccountType: CurrentAccount" + "\nAccountNumber:" + getAccountBalance();
    }
}