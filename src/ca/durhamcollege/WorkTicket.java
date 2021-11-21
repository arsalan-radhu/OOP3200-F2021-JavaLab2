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

    public void setNumber()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        int number = 0;

        while(isValid)
        {
            System.out.print("\nPlease enter a ticket number: ");
            number = keyboard.nextInt();
            if(number <= 0)
            {
                throw new IllegalArgumentException("ERROR! only positive numbers");
            }
            else
            {
                this.number = number;
                isValid = false;
            }
        }

    }
}
