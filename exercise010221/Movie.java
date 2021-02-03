package com.company;

import java.util.Date;

public class Movie
{
    public final String name;
    public final Date dateReleased;
    public float rating;
    public String genre;

    public static int movieCounter = 0;
    public static final int ratingForOscar = 9;

    public Movie(String name, Date dateReleased, float rating, String genre)
    {
        this.name = name;
        this.dateReleased = dateReleased;
        this.rating = rating;
        this.genre = genre;
        movieCounter++;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "name='" + name + '\'' +
                ", dateReleased=" + dateReleased +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

    public static void resetCounter()
    {
        movieCounter = 0;
    }

    public boolean isWonOscar()
    {
        return rating >= ratingForOscar;
    }
}
