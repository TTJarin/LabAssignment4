package problem8_25;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(300);
        bankAccount.deposit(100);
        bankAccount.withdraw(70);
        System.out.println("Balance : $" + bankAccount.getBalance());
        System.out.println("Statement :" + bankAccount.getStatement());
        bankAccount.clearStatement();
        System.out.println("Cleared statement : " + bankAccount.getStatement());

    }
}
