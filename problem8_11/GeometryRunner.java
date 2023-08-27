package problem8_11;

import java.awt.geom.Ellipse2D;

public class GeometryRunner {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,40,50) ;

        System.out.println("An ellipse with a = " + ellipse.getHeight() / 2.0);
        System.out.println("An ellipse with b = " + ellipse.getWidth() / 2.0);
        System.out.printf("Perimeter : %.2f\n" , Geometry.perimeter(ellipse));
        System.out.printf("Area : %.2f" , Geometry.area(ellipse));
    }
}
