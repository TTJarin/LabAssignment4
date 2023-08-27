package problem8_11;

import java.awt.geom.Ellipse2D;

public class Geometry {
    public  static  double perimeter(Ellipse2D.Double ellipse){
        double perimeter ;

        double x = ellipse.getHeight() / 2.0 ;
        double y = ellipse.getHeight() / 2.0 ;
        perimeter = Math.PI * ( 3 * (x + y) - Math.sqrt((3 * x + y) * (x + 3 * y)));

        return perimeter;
    }

    public static double area(Ellipse2D.Double ellipse){
        double area;
        double x = ellipse.getHeight() / 2.0 ;
        double y = ellipse.getWidth() / 2.0 ;

        area = Math.PI * x * y ;
        return  area;
    }
}
