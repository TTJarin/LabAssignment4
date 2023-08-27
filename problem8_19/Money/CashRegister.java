package problem8_19.Money;

import problem8_1.Coin;

public class CashRegister {
    private double purchase;
    private double payment;
    public CashRegister(){
        purchase = 0;
        payment = 0;
    }
    public void recordPurchase(double amount){
        purchase = purchase + amount;
    }
    public void receivedPayment(int coinCount, Coin coinType){
        payment = payment + coinCount * coinType.getCoinValue();
    }

    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
