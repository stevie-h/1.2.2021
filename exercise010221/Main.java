package com.company;

// import java.util.Random;
// import java.util.Scanner;

// https://qaarchint.files.wordpress.com/2021/01/javaex4.pdf


public class Main
{

    public static void main(String[] args)
    {
        // Scanner s = new Scanner(System.in);
        // Random r = new Random();

        //ex3+4
        createDog();

        //ex7
        printDog();

        //ex8
        FootballTeam team1 = new FootballTeam();
        team1.playerList[0] = "C Gordon";
        team1.playerList[1] = "M Smith";
        team1.playerList[2] = "C Halkett";
        team1.playerList[3] = "C Berra";
        team1.playerList[4] = "S Kingsley";
        team1.playerList[5] = "A Irving";
        team1.playerList[6] = "A Halliday";
        team1.playerList[7] = "J Walker";
        team1.playerList[8] = "S Naismith";
        team1.playerList[9] = "A White";
        team1.playerList[10] = "L Boyce";
        team1.replacePlayer("J Walker", "J Ginnelly");

        //ex13
        Weather w1 = new Weather(21f, 30f, false, 9.0f);
        w1.changeChanceOfRain(15.9f);
        w1.changeChanceOfRain(-4.5f);

        //ex15
        addToMemory();

        //ex17
        myBanks();

    }



    //ex17
    public static void myBanks()
    {
        BankAccount[] myAccounts = {new BankAccount("acc1", 10f, 50),
                new BankAccount("acc2", -1000f,10),
                new BankAccount("acc3", 10000, 100)};
        myAccounts[0].checkBalance();
        myAccounts[1].checkBalance();
        myAccounts[2].checkBalance();
        if (myAccounts[0].creditScore > myAccounts[1].creditScore
                && myAccounts[0].creditScore > myAccounts[2].creditScore)
        {
            myAccounts[0].deposit(1000);
        }
        else if (myAccounts[1].creditScore > myAccounts[2].creditScore)
        {
            myAccounts[1].deposit(1000);
        }
        else
        {
            myAccounts[2].deposit(1000);
        }
    }

    //ex15
    public static void addToMemory()
    {
        Memory.add(1);
        Memory.add(1.1f);
        Memory.add("1");
    }

    //ex12
    public static void createHouses()
    {
        House h1 = new House("McLeod St", 78,"Ann Budge");
        House h2 = new House("Pittodrie St", 89);
    }

    //ex9
    public static void createMeals()
    {
        Meal meal1 = new Meal("First meal", false, 121.1f);
        Meal meal2 = new Meal("Second meal", true, 90.9f);
    }

    //ex7
    public static void printDog()
    {
        Dog dog2 = new Dog();
        dog2.name = "Freddie";
        dog2.age = 2;
        dog2.breed = "whippet";
        System.out.println(dog2);
    }

    //ex3+4
    public static void createDog()
    {
        Dog dog1 = new Dog();
        dog1.name = "Homer";
        dog1.age = 17;
        dog1.breed = "westie";
    }

}
