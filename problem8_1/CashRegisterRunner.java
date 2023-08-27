package problem8_1;

public class CashRegisterRunner {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.00,"Dollar");
        final Coin QUARTER = new Coin(0.25,"Quarter");
        final Coin DIME = new Coin(0.10,"Dime");
        final Coin NICKEL = new Coin(0.05,"Nickel");
        final Coin PENNY = new Coin(0.01,"Penny");

        CashRegister cashRegister = new CashRegister();

        cashRegister.recordPurchase(5.67);
        cashRegister.recordPurchase(7.4);
        cashRegister.recordPurchase(3.87);

        cashRegister.receivedPayment(20,DOLLAR);
        cashRegister.receivedPayment(20,QUARTER);
        cashRegister.receivedPayment(15,DIME);
        cashRegister.receivedPayment(10,NICKEL);
        cashRegister.receivedPayment(5,PENNY);

        System.out.println("Received change : " + cashRegister.giveChange());
    }
}
