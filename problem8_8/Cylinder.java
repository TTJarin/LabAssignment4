package problem8_8;

public class Cylinder {
    public double getCylinderVolume(double r , double h){
        return  Math.PI * Math.pow(r,2) * h;
    }
    public double getCylinderSurface(double r , double h){
        return (2 * Math.PI * r * h) +(2 * Math.PI * Math.pow(r,2));
    }
}
