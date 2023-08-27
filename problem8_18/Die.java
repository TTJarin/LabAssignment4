package problem8_18;

import java.util.Random;

public class Die {
    private static Random genarator;
    private int sides;
    public Die(int s){
        sides = s;
        genarator = new Random();
    }
    public int cast(){
        return 1 + genarator.nextInt(sides);
    }
}
