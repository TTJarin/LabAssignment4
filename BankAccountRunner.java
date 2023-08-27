import problem8_20.com.gmail.tasnim233.BankAccount.BankAccount;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500.25);
        System.out.println("Tasnim ");
        System.out.println("Account Number :" + bankAccount.getAccountNumber());
        System.out.println("Balance :" + bankAccount.getBalance());

    }
}
