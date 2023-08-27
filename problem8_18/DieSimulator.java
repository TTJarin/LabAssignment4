package problem8_18;

public class DieSimulator {
    public static void main(String[] args) {
        Die die = new Die(6);
        final int TRIES = 10;
        System.out.print("Die : ");

        for(int i = 0 ; i < TRIES ; i++){
            int n = die.cast();
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
