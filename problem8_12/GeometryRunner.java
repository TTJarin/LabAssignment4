package problem8_12;

import java.awt.geom.Point2D;

public class GeometryRunner {
    public static void main(String[] args) {
        Point2D.Double p = new Point2D.Double(2,3);
        Point2D.Double q = new Point2D.Double(5,-2);
        System.out.println("Angle : " + Geometry.angle(p,q));
        System.out.println("Slope : " + Geometry.slope(p,q));
    }
}
