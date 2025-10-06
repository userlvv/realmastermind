package mastermind;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math; 

public class gamereal
{

    public static void main(String[] args)
    {
	Random rmd = new Random();
	// CODEMAKER
	String[] colors = new String[6]; 
	Scanner sc = new Scanner(System.in);

	colors[0] = "Red";
	colors[1] = "Blue";
	colors[2] = "Green";
	colors[3] = "Purple";
	colors[4] = "Orange";
	colors[5] = "Yellow"; 

	String[] secret = new String[4];

	System.out.println("For Testing Purposes");
	for(int i = 0; i < 4; i++) {   
	    int rng = rmd.nextInt(6);
	    String color = colors[rng];
	    secret[i] = color;
	    System.out.println(color);
	  
	}
	System.out.println("Choose 4 colors, 1 at a time:");
	String[] guess = new String[4];
	for (int i = 0; i < 4; i++)
	guess[i] = sc.next();
	
//	guess[i] = sc.next();
//	i++;
//	guess[i] = sc.next();
//	i++;
//	guess[i] = sc.next();
//	i++;
//	guess[i] = sc.next();
	
	
    }
    
    {
		

    }
}
