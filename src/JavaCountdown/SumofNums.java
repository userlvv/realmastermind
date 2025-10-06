/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCountdown;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;

        int i = 0;
	   do {
	   System.out.print("Enter a number (-1 to quit): ");
	   int number = console.nextInt();
	   sum = sum + number; // moved to top of loop
	   i++;
	   
        }while( i < 10 );

        System.out.println("The sum is " + sum);
        

    }
}
