package problem8_9;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENT = 5;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < NUMBER_OF_STUDENT ; i++){
            String name = scanner.next();
            Student student = new Student(5,name);


            System.out.println("Student name : " + student.getName());
            //System.out.println("Total score : " + student.sum());
            System.out.println("enter  scores:");
            student.sum();
        }

    }
}
