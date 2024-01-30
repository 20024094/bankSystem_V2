package banking;

/**
 *
 * @author danie
 */

public class CurrentAccount extends BankAccount {
    
    private static double interestRate = 0.05;
    
    public CurrentAccount(){
        super();
    }
    
    public CurrentAccount(double amount){
        super(amount);
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        CurrentAccount.interestRate = interestRate;
    }
    
    @Override
    public void deposit(double amount){
        double interestAmount = (amount / 100) * interestRate;
        
        super.deposit(amount + interestAmount);
              
        System.out.println("Applying " + interestRate + "% interest");
        System.out.println("£" + (amount + interestAmount) + " deposited to account");
       
        displayBalance();
        
        System.out.println("================================");
    }
    
        @Override
    public int withdraw(double amount){
        
        if ((getBalance() - amount) < 0 ){
            System.out.println("Insufficient Funds");
            return 0;
        } else {
            super.withdraw(amount);
            System.out.println("£" + amount + " withdrawn from account");
            return 1;
        }
    }
}
