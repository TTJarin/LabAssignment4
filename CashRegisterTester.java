import problem8_1.CashRegister;
import problem8_1.Coin;

public class CashRegisterTester {
    public static void main(String[] args) {
        final problem8_1.Coin DOLLAR = new problem8_1.Coin(1.00,"Dollar");
        final problem8_1.Coin QUARTER = new problem8_1.Coin(0.25,"Quarter");
        final problem8_1.Coin DIME = new problem8_1.Coin(0.10,"Dime");
        final problem8_1.Coin NICKEL = new problem8_1.Coin(0.05,"Nickel");
        final problem8_1.Coin PENNY = new Coin(0.01,"Penny");

        problem8_1.CashRegister cashRegister = new CashRegister();

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
