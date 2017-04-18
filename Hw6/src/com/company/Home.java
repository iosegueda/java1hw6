package com.company;

/**
 * Created by Iris on 7/31/2015.
 */
public class Home extends House
{
    String family;
    OurDate dateMovedIn;

    public Home (int house, String street, String town, String family, OurDate movedIn)
    {
        super(house, street, town, 0, 0);
        this.family = family;
        this.dateMovedIn = movedIn;
    }

    public Home (int house, String street, String town, int yearConstructed, int propertyTax, String family, OurDate movedIn)
    {
        super(house, street, town, yearConstructed, propertyTax);
        this.family = family;
        this.dateMovedIn = movedIn;
    }
    public String toString()
    {
        return super.toString() + " has been occupied by " + family + " since " + dateMovedIn;
    }
    public void setFamily(String family)
    {
        this.family = family;
    }
    public void setDateMovedIn(OurDate date)
    {
        this.dateMovedIn = date;
    }
    public String getFamily()
    {
        return family;
    }
    public OurDate getDateMovedIn(OurDate date)
    {
        return dateMovedIn;
    }

}
