package problem8_16;

import java.util.Scanner;

public class Input {
    public static int readInt(Scanner in , String prompt , String error , int min , int max){
        boolean outOfBounds = false;
        int num;
        do {
            System.out.print(prompt);
            num = in.nextInt();
            if (num >= min && num <= max){
                outOfBounds = false;
            }
            else {
                System.out.println(error);
                outOfBounds = true;
            }

        }while (outOfBounds == true);
        return  num;
    }
}
