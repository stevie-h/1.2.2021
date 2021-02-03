package com.company;

//ex12

import lombok.AllArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor
@ToString

public class House
{
    public final String address;
    public final float area_sq;
    public String owner;

    public House(String address, float area_sq)
    {
        this.address = address;
        this.area_sq = area_sq;
    }

    public House(String address, float area_sq, String owner)
    {
        this.address = address;
        this.area_sq = area_sq;
        this.owner = owner;
    }

}
