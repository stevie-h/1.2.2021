package com.company;

//ex8

public class FootballTeam
{
    public String name;
    public String country;
    public String[] playerList = new String[11];
    public int rating;

    public void changeRating(int new_rating)
    {
        rating = new_rating;
    }

    public void replacePlayer(String curr_player, String new_player)
    {
        for (int i=0; i < playerList.length; i++)
        {
            if (playerList[i].equals(curr_player))
            {
                playerList[i] = new_player;
                break;
            }
        }

    }

}
