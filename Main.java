public class Main {

    public static void main(String[] args){
        SavingsAccount sAccount = new SavingsAccount(1234, "Beatrice");
        CurrentAccount cAccount = new CurrentAccount(346875, "Abraham", 1000);


        sAccount.displayAccountDetails();
        cAccount.displayAccountDetails();

        sAccount.applyForLoan(200);

    }
    
}
