package Bootcamp;

import java.util.Scanner;

public class Lab5_RandomNumberGenerator {
    /*
    This is the method "main"
    It has to be in the class body
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Random Number Generator!");
        int answer = 1;

        while (answer == 1) {

            //1. prompt user for number of sides of dice
            System.out.print("How many sides should each die have?: ");

            //2. capture user input
            Scanner scan = new Scanner(System.in);//Scanner needed to monitor keyboard
            int sides = scan.nextInt(); //Captures users input

            //3. prompt user if ready to roll dice
            System.out.println("Are you ready to roll? Enter a number.");

            //4. capture user input
            scan.nextInt(); //we don't need to declare a value because we won't be saving the number for any reason

            //5. roll dice
            int result1 = diceRoll(sides);
            int result2 = diceRoll(sides);

            //6. display results
            System.out.println("Your numbers are " + result1 + " and " + result2);

            //7. prompt user to roll again
            System.out.println("Do you want to roll again? 1 for yes,2 for no");

            //8. capture user choice
            answer = scan.nextInt();
        }
        System.out.println("Thank you, have a nice day!");
    }
    public static int diceRoll(int sides) {
        //int n = 0 ;
       int n = (int) (Math.random()* 6 +1);
        return n;
    }
}
