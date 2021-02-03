package com.company;

public class Dog
{
    //ex4
    public String name;
    public int age;
    public String breed;

    //ex5
    public void bark()
    {
        System.out.println(String.format("Woof woof, %s, !", name));
    }

    //ex7
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
