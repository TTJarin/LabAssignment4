package problem8_7;

import java.util.Scanner;

public class GeometryRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a redius : ");
        double radius = scanner.nextDouble();

        System.out.println("Please enter a height : ");
        double height = scanner.nextDouble();

        Geometry geometry = new Geometry();

        System.out.printf("Volume of a Cube: %.2f\n", geometry.cubeVolume(height));
        System.out.printf("Surface Area of a Cube: %.2f\n", geometry.cubeSurface(height));
        System.out.printf("Volume of a Sphere: %.2f\n", geometry.sphereVolume(radius));
        System.out.printf("Surface Area of a Sphere: %.2f\n", geometry.sphereSurface(radius));
        System.out.printf("Volume of a Cylinder: %.2f\n", geometry.cylinderVolume(radius, height));
        System.out.printf("Surface Area of a Cylinder: %.2f\n", geometry.cylinderSurface(radius, height));
        System.out.printf("Volume of a Cone: %.2f\n", geometry.coneVolume(radius, height));
        System.out.printf("Surface Area of a Cone: %.2f\n", geometry.coneSurface(radius, height));

    }
}
