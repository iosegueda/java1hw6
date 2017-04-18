package com.company;

/**
 * Created by Iris on 7/30/2015.
 */
public class House
{
    private int stnum;
    private String stname;
    private String town;
    private int yearOfConstruction;
    private int tax;

    public House()
    {
        this(0, "NONE", "NONE", 0, 0);
    }
    public House ( int num, String name, String t, int yr, int tx)
    {
        setStnum(num);
        setStname(name);
        setTown(t);
        setYear(yr);
        setTax(tx);
    }
    public int getStnum()
    {
        return stnum;
    }
    public String getStname()
    {
        return stname;
    }
    public String getTown()
    {
        return town;
    }
    public int getYear()
    {
        return yearOfConstruction;
    }
    public int getTax()
    {
        return tax;
    }
    public void setStnum( int num )
    {
        stnum = num;
    }
    public void setStname( String name )
    {
        stname = name;
    }
    public void setTown(String t)
    {
        town = t;
    }
    public void setYear( int yr )
    {
        yearOfConstruction = yr;
    }
    public void setTax( int tx)
    {
        tax = tx;
    }
    public String toString()
    {
        return "Location: " + stnum + "" + stname + "" + town +
                "Property Tax: " + tax + "Year of Construction: " + yearOfConstruction;
    }

}
