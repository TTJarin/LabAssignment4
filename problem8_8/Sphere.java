package problem8_8;

public class Sphere {
    public double getSphereVolume(double r){
        return (4.0 / 3.0) * Math.PI * Math.pow(r,3);
    }
    public double getSphereSurface(double r){
        return 4.0  * Math.PI * Math.pow(r,2);
    }
}
