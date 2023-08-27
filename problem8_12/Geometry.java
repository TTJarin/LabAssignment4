package problem8_12;

import java.awt.geom.Point2D;

public class Geometry {
    public static double angle(Point2D.Double p, Point2D.Double q){
       double angle;
       double xLength;
       double yLength;
       if(q.getX() > p.getX() && q.getY() > p.getY()){
           xLength = q.getX() - p.getX();
           yLength = q.getY() - p.getY();

           angle = Math.atan2(yLength,xLength);
           angle = Math.toDegrees(angle);

           angle = angle + 0;
       } else if (q.getX() < p.getX() && q.getY() > p.getY()) {
           xLength = p.getX() - q.getX();
           yLength = p.getY() - q.getY();
           angle = Math.atan2(yLength,xLength);
           angle = Math.toDegrees(angle);
           angle = angle + 90;
       } else if (q.getX() < p.getX() && q.getY() < p.getY()) {
           xLength = p.getX() - q.getX();
           yLength = p.getY() - q.getY();
           angle = Math.atan2(yLength,xLength);
           angle = Math.toDegrees(angle);
           angle = angle + 180;
       } else if (q.getX() > p.getX() && q.getY() < p.getY()) {
           xLength = q.getX() - p.getX();
           yLength = p.getY() -q.getY();

           angle = Math.atan2(yLength,xLength);
           angle = Math.toDegrees(angle);

           angle = 360 - angle;
       }else {
           angle = 0;
       }
       return  angle;
    }
    public static double slope(Point2D.Double p, Point2D.Double q){
        double slope;
        double deltaY = q.getY() - p.getY();
        double deltaX = q.getX() - p.getX();
        slope = deltaY / deltaX;
        return slope;
    }
}
