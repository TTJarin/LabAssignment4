package problem8_13;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {
    Geometry geometry;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
       geometry = new Geometry();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isInside() {
        Point2D.Double p1 = new Point2D.Double(-10,0);
        Ellipse2D.Double e = new Ellipse2D.Double(0,0,20,16);
        boolean onBoundary = Geometry.isInside(p1,e);
        assertEquals(false,onBoundary);
    }

    @org.junit.jupiter.api.Test
    void isOnBoundary() {
        Point2D.Double p1 = new Point2D.Double(-10,0);
        Ellipse2D.Double e = new Ellipse2D.Double(0,0,20,16);
        boolean onBoudary = Geometry.isOnBoundary(p1,e);
        assertEquals(true,onBoudary);
    }
}