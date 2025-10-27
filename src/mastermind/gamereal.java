package mastermind;
import java.util.*;
import java.lang.Math;

public class gamereal {

    public static void main(String[] args) {
    	Random random = new Random();
    	Scanner input = new Scanner(System.in);
        int black;
        black = 0;
        boolean won = false;
        String[] secret = new String[4];
        String colors[] = {"Red", "Blue", "Green", "Purple", "Orange", "Yellow"};
        
        System.out.println("Welcome to Mastermind");
        System.out.println("You can choose between the colors: red, blue, green, purple, orange and yellow");
        System.out.println("Black = Correct color on correct position");
        System.out.println("Gray = Incorrect color on incorrect position");
        System.out.println("White = Correct color on incorrect position");
        System.out.println("");
        System.out.println("Do you want the code to show? Y/N (only answer in 'y' or 'n')");
        
        String answerInput = input.next();
    	String answerYes = ("Y");

        for (int i = 0; i < 4; i++) {
            int rng = random.nextInt(6);
            secret[i] = colors[rng];
            if (answerInput.equalsIgnoreCase(answerYes))
            System.out.println(secret[i]);
            else 
            System.out.println("No code shown");
            
        }
        for (int tenTurns = 0; tenTurns < 10; tenTurns++) {
        	System.out.println("Choose 4 colors, 1 at a time:");
            String[] guess = new String[4];

            for (int i = 0; i < 4; i++) {
                guess[i] = input.next();
            }
            for (int i = 0; i < 4; i++) {
                String feedback;
                feedback = "Gray";
                if (guess[i].equalsIgnoreCase(secret[i])) {
                    feedback = "Black";
                    black = black + 1;
                } else {
                	for (int y = 0; y < 4; y++) {
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
            input.close();
        } else {
            System.out.println("You have lost! Restart for next round.");
            input.close();
        }
    }
}