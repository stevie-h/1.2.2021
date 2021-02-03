package com.company;

//ex13

import lombok.AllArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor
@ToString

public class Weather
{
    public float temperature;
    public float humidity;
    public boolean cloudy;
    public float chanceOfRain;

    public void changeChanceOfRain(float update_chance)
    {
        if (update_chance >= 0 && update_chance <= 100)
        {
            chanceOfRain = update_chance;
        }
        else
        {
            System.out.println("Chance of rain must be 0-100!");
        }
    }

    public void printTempFahrenheit()
    {
        System.out.println(String.format("Temperature: %f (c) / %f (f)", temperature, temperature * 1.8 + 32));
    }

    public Weather(float temperature, float humidity, boolean cloudy, float chanceOfRain)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.cloudy = cloudy;
        this.chanceOfRain = chanceOfRain;
    }
}
