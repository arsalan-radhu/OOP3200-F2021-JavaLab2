package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

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
        boolean isValid = true;
        int day = 0, month = 0, year = 0;

        try {

            while (isValid) {
                System.out.print("\nPlease enter the day: ");
                day = keyboard.nextInt();
                if (day >= MIN_DAY && day <= MAX_DAY) {
                    isValid = false;
                } else {
                    System.out.print("\nDay must be between 1 and 30. Try Again!\n");
                }
            }
            isValid = true;
            System.out.printf("Day is: %d\n", day);

            while(isValid)
            {
                System.out.print("\nPlease enter the month: ");
                month = keyboard.nextInt();
                if (month >= MIN_MONTH && month <= MAX_MONTH)
                {
                    isValid = false;
                }
                else
                {
                    System.out.print("\nMonth must be between 1 and 12. Try Again!\n");
                }
            }
            isValid = true;
            System.out.printf("Month is: %d\n", month);

            while(isValid)
            {
                System.out.print("\nPlease enter the Year: ");
                year = keyboard.nextInt();
                if (year >= MIN_YEAR && year <= MAX_YEAR)
                {
                    isValid = false;
                }
                else
                {
                    System.out.print("\nYear must be between 2000 and 2099. Try Again.\n");
                }
            }
            isValid = true;
            System.out.printf("Year is: %d\n", year);

            LocalDate date;
            date = LocalDate.of(year, month, day);
            //    System.out.printf("The Date is: %s", date.toString());

            this.date = date;

        }
        catch (DateTimeException dte) {
            System.out.print("\nUnexpected error.");
            keyboard.nextLine();
        }
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription()
    {

        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        String description = null;
        while(isValid)
        {
            System.out.print("\nEnter the reason for making a ticket: ");
            description = keyboard.nextLine();
            if(description.length() <= 0)
            {
                throw new IllegalArgumentException("Description should not be empty.");
            }
            else
            {
                this.description = description;
                isValid = false;
            }
        }

    }

    //Default Constructor
    WorkTicket()
    {
        this.number = 0;
        this.id = null;
        this.date = null;
        this.description = null;
    }
    //Object Constructor
    WorkTicket(@NotNull WorkTicket ticket)
    {
        this.number = ticket.number;
        this.id = ticket.id;
        this.date = ticket.date;
        this.description = ticket.description;
    }
    //Parameterized  Constructor
    WorkTicket(int number, String id, LocalDate date, String desc)
    {
        this.number = number;
        this.id = id;
        this.date = date;
        this.description = desc;
    }
}