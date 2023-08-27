package problem8_8;

public class Cone {
    public double getConeVolume(double r , double h){
        return  Math.PI * Math.pow(r,2) * ( h / 3.0);
    }
    public double getConeSurface(double r , double h){
        return  Math.PI * 2 * ( r + Math.sqrt(Math.pow(r,2) + Math.pow(h,2)));
    }

}
