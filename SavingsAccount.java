public class SavingsAccount extends BankAccount implements LoanAccount{


    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);

    }

    public SavingsAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName, 0.0);

    }

    public double calculateInterest(double balance){
        double  principal = balance;
        final double interestRate = 0.04;
        double time = 1;  //interest after every year
        
        
        double interest = principal * interestRate * time;
        return interest;

    }

    public  void applyForLoan(double loanAmount){
        System.out.println(getAccountHolderName() + "requests a loan of the amount" + loanAmount + "GH");
    }

    @Override
    public String toString(){
        return "Bank Receipt " + "\n AccountType: SavingsAccount" + "\nAccountNumber:" + getAccountBalance();
    }

}