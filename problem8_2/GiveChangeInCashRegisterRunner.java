package problem8_2;

public class GiveChangeInCashRegisterRunner {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.00,"Dollar");
        final Coin QUARTER = new Coin(0.25,"Quarter");
        final Coin DIME = new Coin(0.10,"Dime");
        final Coin NICKEL = new Coin(0.05,"Nickel");
        final Coin PENNY = new Coin(0.01,"Penny");

        ModifyGiveChangeInCashRegister cashRegister = new ModifyGiveChangeInCashRegister();

        cashRegister.recordPurchase(3.67);
        cashRegister.recordPurchase(4.4);
        cashRegister.recordPurchase(6.87);

        cashRegister.receivedPayment(20,DOLLAR);

        System.out.println("Total purchase : $" + cashRegister.getTotalPurchase());
        System.out.println("Total payment : $" + cashRegister.getTotalPayment());
        System.out.println("Total change : $" + cashRegister.getTotalChange());

        System.out.println("Number of Dollars : " + cashRegister.giveChange(DOLLAR));
        System.out.println("Number of Quarter : " + cashRegister.giveChange(QUARTER));
        System.out.println("Number of Dime : " + cashRegister.giveChange(DIME));
        System.out.println("Number of Nickel : " + cashRegister.giveChange(NICKEL));
        System.out.println("Number of Penny : " + cashRegister.giveChange(PENNY));
    }
}
