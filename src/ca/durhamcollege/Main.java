/*
* Name: Arsalan Arif Radhu
* Student ID: 100813965
* Date: 21 November 2021
* Description: Main file for showing the working of the work ticket class.
*/
package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //DECLARATIONS
        //VARIABLES
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        WorkTicket ticket = new WorkTicket();

        // Looping until correct input is entered
        do
        {
            try
            {
                // Trying to set work ticket with user input
                ticket.SetWorkTicket();
                // If valid input, then printing the output using override toString()
                System.out.println(ticket.toString());
                isValid = false;
            }
            catch(IllegalArgumentException iae)
            {
                // Error message
                System.out.printf("\n INVALID: %s", iae.toString());
                keyboard.nextLine();
                isValid = true;
            }
            catch(InputMismatchException ime)
            {
                // Error message
                System.out.print("\nPlease enter correct input.");
                keyboard.nextLine();
                isValid = true;
            }
        } while (isValid);

    }
}

