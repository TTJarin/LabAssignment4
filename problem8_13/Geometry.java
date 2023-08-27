package problem8_13;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry {
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e){
        double pointX = p.getX();
        double pointY = p.getY();

        double centerX = e.getX();
        double centerY = e.getY();
        double radiusX = e.getCenterX();
        double radiusY = e.getCenterY();

        double a = Math.pow(radiusX, 2);
        double b = Math.pow(radiusY, 2);

        double eq1 = Math.pow(pointX - centerX , 2);
        double eq2 = Math.pow(pointY - centerY, 2);

        if ((eq1 / a) + (eq2 / b) < 1){
            return true;
        }else {
            return false;
        }

    }
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e){
        double pointX = p.getX();
        double pointY = p.getY();

        double centerX = e.getX();
        double centerY = e.getY();
        double radiusX = e.getCenterX();
        double radiusY = e.getCenterY();

        double a = Math.pow(radiusX, 2);
        double b = Math.pow(radiusY, 2);

        double eq1 = Math.pow(pointX - centerX , 2);
        double eq2 = Math.pow(pointY - centerY, 2);

        if ((eq1 / a) + (eq2 / b) == 1){
            return true;
        }else {
            return false;
        }
    }
}
