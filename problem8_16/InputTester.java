package problem8_16;

import java.util.Scanner;

public class InputTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(Input.readInt(in,"Please enter an intrger",
                "The integer is out of bounds",0,100));
    }
}
