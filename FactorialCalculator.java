/*
* This program calculates a factorial using recursion.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-11-09
*/

import java.util.Scanner;

/**
 * This is a factorial calculator.
*/

final class FactorialCalculator {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private FactorialCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function calculates a factorial.
     *
     * @param userInt number to be base calculation on.
     * @return final factorial calculation as an integer.
     */
    public static int factorial(final int userInt) {
        final int answer;
        if (userInt < 0) {
            answer = -1;
        } else if (userInt == 0) {
            answer = 1;
        } else {
            answer = userInt * factorial(userInt - 1);
        }
        return answer;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Input.
        final Scanner userInput = new Scanner(System.in);
        System.out.printf("enter factorial: ");

        // Process and Output.
        try {
            final float preRound = userInput.nextFloat();
            final int userInt = Math.round(preRound);
            System.out.println("\n" + userInt + "! = " + factorial(userInt));
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nPlease enter an integer next time.");
        }
        System.out.println("\nDone.");
    }
}
