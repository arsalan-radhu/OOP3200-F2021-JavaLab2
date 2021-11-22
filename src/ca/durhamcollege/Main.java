package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Declarations
        //Variables
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        WorkTicket ticket = new WorkTicket();

        do
        {
            try
            {
                ticket.SetWorkTicket();
                System.out.println(ticket.toString());
                isValid = false;
            }
            catch(IllegalArgumentException iae)
            {
                System.out.printf("\n INVALID: %s", iae.toString());
                keyboard.nextLine();
                isValid = true;
            }
            catch(InputMismatchException ime)
            {
                System.out.print("\nINVALID: Your input was incorrect, try again.");
                keyboard.nextLine();
                isValid = true;
            }
        } while (isValid);

    }
}

