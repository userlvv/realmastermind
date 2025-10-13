package mastermind;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class gamereal {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int rng;
        int tenTurns;
        tenTurns = 0;
        int black;
        black = 0;
        int i;
        i = 0;
        int y;
        y = 0;
        String[] secret = new String[4];
        String[] colors = new String[6];

        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Green";
        colors[3] = "Purple";
        colors[4] = "Orange";
        colors[5] = "Yellow";
        boolean won = false;

        
        for (i = 0; i <= 3; i++) {
            rng = random.nextInt(6);
            secret[i] = colors[rng];
            System.out.println(secret[i]);
        }
        for (tenTurns = 0; tenTurns <= 9; tenTurns++) {
            System.out.println("Choose 4 colors, 1 at a time:");
            String[] guess = new String[4];

            for (i = 0; i <= 3; i++) {
                guess[i] = input.next();
            }
            for (i = 0; i <= 3; i++) {
                String feedback;

                feedback = "Colour not found.";
                if (guess[i].equalsIgnoreCase(secret[i])) {
                    feedback = "Black";
                    black = black + 1;
                } else {
                    for (y = 0; y <= 3; y++) {
                        if (secret[i].equalsIgnoreCase(guess[y]) && y != i) {
                            feedback = "White";
                        }
                    }
                }
                System.out.println(feedback);
            }
            if (black == 4) {
                tenTurns = 10;
                won = true;
            }
            black = 0;
        }
        if (won == true) {
            System.out.println("You have won! Restart for next round.");
        } else {
            System.out.println("You have lost! Restart for next round.");
        }
    }
    
    {
    }
}
