package problem8_19.Money;

public class Coin {
    private double coinValue;
    private String coinName;
    public Coin(double value, String name){
        coinName = name;
        coinValue = value;
    }
    public double getCoinValue(){
        return coinValue;
    }
    public String getCoinName(){
        return coinName;
    }
    public void setCoinValue(double value){
        this.coinValue = value;
    }
    public void setCoinName(String name){
        this.coinName = name;
    }
}
