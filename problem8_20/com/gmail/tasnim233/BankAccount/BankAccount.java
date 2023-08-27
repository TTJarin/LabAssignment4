package problem8_20.com.gmail.tasnim233.BankAccount;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private static int lastAssignedNumber = 1000;
    public static final double OVERDRAFT_FEE = 25.25;
    public BankAccount(){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        balance = 0;
    }
    public BankAccount(double initialBalance){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        balance = initialBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        if (amount > balance){
            balance = balance = OVERDRAFT_FEE;
        }else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
    public double getAccountNumber(){
        return accountNumber;
    }
}
