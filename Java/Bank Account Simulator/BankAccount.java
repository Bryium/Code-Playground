
public class BankAccount {
    private String accountHolder;
    private double balance;

//    Constructor to create Account
    public BankAccount(String accountHolder, double intialbalance){
        this.accountHolder = accountHolder;
        if(intialbalance < 0){
            throw new IllegalArgumentException("initial balance cannot be negative");
        }
        this.balance = intialbalance;
    }

//    Deposit Method
    public void Deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        balance += amount;
        System.out.println("Deposited " + amount);
    }

// Withdraw Method
    public void Withdraw(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Withdraw amount cannot be negative");
        }
         if(amount > balance){
             throw new IllegalArgumentException("Insufficient balance");
         }
         balance -= amount;
         System.out.println("Withdrawn " + amount);
    }

//    Check Balance
    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }


}
