package problem8_9;

import java.util.Scanner;

public class Student {
    private double[] scores ;
    private int scoresSize;
    private String studentName;

    public Student(int length, String name){
        scores = new double[length];
        scoresSize = 0;
        studentName = name;
    }
    Scanner scanner = new Scanner(System.in);

    public void sum(){
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++){
            scores[i] = scanner.nextDouble();
            totalScore = totalScore + scores[i];
        }
        System.out.println("Total score :" + totalScore);
    }
    public String getName(){
        return studentName;
    }
}
