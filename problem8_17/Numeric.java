package problem8_17;

public class Numeric {
    public static double intPower(double x, int n){
        if(n < 0){
            return 1.0 / Math.pow(x,-n);
        } else if (n > 0 && n % 2 == 0) {
            return Math.pow(Math.pow(x,n / 2.0),2);
        }else {
            return Math.pow(x,n-1) * x;
        }
    }
}
