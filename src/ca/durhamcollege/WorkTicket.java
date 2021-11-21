package ca.durhamcollege;

import java.time.LocalDate;

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
}
