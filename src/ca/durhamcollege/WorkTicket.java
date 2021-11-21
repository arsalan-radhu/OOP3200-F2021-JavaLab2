package ca.durhamcollege;

import java.time.LocalDate;
import java.util.Scanner;

public class WorkTicket
{
    //private instance variables/Attributes
    public int number;
    public String id;
    public LocalDate date;
    public String description;

    //public properties (setters/getters)
    public int getNumber()
    {
        return number;
    }

    public void setTicketNumber()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        int ticketNumber = 0;

        while(isValid)
        {
            System.out.print("\nEnter a ticket number: ");
            ticketNumber = keyboard.nextInt();
            if(ticketNumber <= 0)
            {
                throw new IllegalArgumentException("Please enter positive numbers only.");
            }
            else
            {
                this.number = ticketNumber;
                isValid = false;
            }
        }

    }

    public String getId()
    {
        return id;
    }

    public void setId()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        String id = null;
        while(isValid)
        {
            System.out.print("\nEnter a custom ID: ");
            id = keyboard.nextLine();
            if (id.length() <= 0)
            {
                throw new IllegalArgumentException("Input should not be empty.");
            }
            else
            {
                this.id = id;
                isValid = false;
            }
        }


    }

}
