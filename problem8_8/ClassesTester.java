package problem8_8;

import java.util.Scanner;

public class ClassesTester {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Cylinder cylinder = new Cylinder();
        Cone cone = new Cone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a redius : ");
        double radius = scanner.nextDouble();

        System.out.println("Please enter a height : ");
        double height = scanner.nextDouble();

        System.out.printf("Volume of a Cube : %.2f\n",cube.getCubeVolume(height));
        System.out.printf("Surface of a Cube : %.2f\n",cube.getCubeSurface(height));
        System.out.printf("Volume of a Sphere : %.2f\n",sphere.getSphereVolume(radius));
        System.out.printf("Surface of a Sphere : %.2f\n",sphere.getSphereSurface(radius));
        System.out.printf("Volume of a Cylinder : %.2f\n",cylinder.getCylinderVolume(radius,height));
        System.out.printf("Surface of a Cylinder : %.2f\n",cylinder.getCylinderSurface(radius,height));
        System.out.printf("Volume of a Cone : %.2f\n",cone.getConeVolume(radius,height));
        System.out.printf("Surface of a Cone : %.2f\n",cone.getConeSurface(radius,height));
    }
}
