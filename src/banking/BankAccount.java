package banking;

/**
 *
 * @author danie
 */

public abstract class BankAccount {
    
    private double balance;
        
    public BankAccount(){
        balance=0;
    }
    
    public BankAccount(double amount){
        balance = amount;
    }
    
    public void displayBalance(){
        System.out.println("Balance: £" + balance);
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public int withdraw(double amount){
        balance -= amount;
        return 1;
    }
    
    public double getBalance(){
        return balance;
    }
}
