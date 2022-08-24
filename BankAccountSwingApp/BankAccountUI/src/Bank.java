import java.util.ArrayList;

/**
 * Manage Bank Accounts
 * 
 * @author Programmer
 */
public class Bank {
    
    // Account Number creator
    private static int accountCounter = 1000;
    private static double FEE = 2.5;
    private static double IR = 0.05; // 5% assumption
     
    // collection of Accounts
    private ArrayList<Account> accounts; 
    
    public Bank() {
        accounts = new ArrayList<>();
    }
    
    /**
     * Add New Accounts
     * 
     * @param account 
     */
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
    
    /**
     * Find an account with given account numbers. 
     * 
     * @param accountNumber
     */
    public Account getAccount(int accountNumber) {
        for(Account account: accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        
        return null; 
    }
    
    /**
     * Deposit amount to an account. 
     * 
     * @param accountNumber
     * @param amount
     * @return 
     */
    public boolean deposit(int accountNumber, double amount) {
        Account account = this.getAccount(accountNumber);
        
        if(account == null) {
            return false; 
        }
        
        if(amount > 0) {           
            account.deposit(amount);
            return true; 
        }
        
        return false; 
    }
    
    /**
     * Withdraw an amount
     * 
     * @param accountNumber
     * @param amount
     * @return 
     */
    public boolean withdraw(int accountNumber, double amount) {
       Account account = this.getAccount(accountNumber);
       
       if(account == null) {
           return false; 
       }
       
       if(amount <= 0 || account.getBalance() < amount) {
           return false; 
       }
       
       account.withdraw(amount);
       return true; 
    }
    
    public static int getNextAccountNumber() {
        accountCounter++;
        return accountCounter;
    }
    
    public static double getFee() {
        return FEE;
    }
    
    public static double getIR() {
        return IR;
    }
}
