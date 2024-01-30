package banking;

/**
 *
 * @author danie
 */

public class OverdraftAccount extends BankAccount {
    
    private double overdraftLimit;
    
    public OverdraftAccount(){
        super();
        overdraftLimit = 100D;
    }
    
    
    public OverdraftAccount(double amount, double overdraftLimit){
        super(amount);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public double getBalance(){
        return Math.abs(super.getBalance() + overdraftLimit);
    }
    
    @Override
    public int withdraw(double amount){
        
        if ((getBalance() - amount) < overdraftLimit ){
            System.out.println("Insufficient Funds");
            return 0;
        } else {
            super.withdraw(amount);
            System.out.println("£" + amount + " withdrawn from account");
            System.out.println("Overdraft Limit: £" + Math.abs(overdraftLimit));
            System.out.println("£" + getBalance() + " left to spend");
            return 1;
        }

    }
}
