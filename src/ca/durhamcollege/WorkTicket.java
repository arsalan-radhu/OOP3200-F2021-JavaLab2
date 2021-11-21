package ca.durhamcollege;

import java.time.DateTimeException;
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

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate() {
        //Constants
        final int MAX_YEAR = 2099;
        final int MIN_YEAR = 2000;
        final int MAX_MONTH = 12;
        final int MIN_MONTH = 1;
        final int MAX_DAY = 30;
        final int MIN_DAY = 1;
        //Variables
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        int day = 0, month = 0, year = 0;

        try {

            while (dirtyFlag) {
                System.out.print("\nPlease enter the day: ");
                day = keyboard.nextInt();
                if (day >= MIN_DAY && day <= MAX_DAY) {
                    dirtyFlag = false;
                } else {
                    System.out.print("\nSorry, that day was invalid. Must be between 1 and 30. Try Again.\n");
                }
            }
            dirtyFlag = true;
            System.out.printf("Day is: %d\n", day);

        }
        catch (DateTimeException dte) {
            System.out.print("\nDATE EXCEPTION: Something went wrong, try again.");
            keyboard.nextLine();
        }
    }
}