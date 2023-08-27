package problem8_8;

public class Cube {
    public double getCubeVolume(double h){
        return Math.pow(h,3);
    }
    public double getCubeSurface(double h){
        return 6 * Math.pow(h,2);
    }
}
