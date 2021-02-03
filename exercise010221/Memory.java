package com.company;

public class Memory
{
    public static int integerM;
    public static float decimalM;
    public static String stringM;

    public static void add(int var)
    {
        integerM += var;
    }
    public static void add(float var)
    {
        decimalM += var;
    }
    public static void add(String var)
    {
        stringM += var;
    }

}
