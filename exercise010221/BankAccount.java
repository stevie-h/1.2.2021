package com.company;

public class BankAccount
{
    public String ownerName;
    public float balance;
    public int creditScore;
    public boolean isFrozen;

    public BankAccount(String ownerName, float balance, int creditScore)
    {
        this.ownerName = ownerName;
        this.balance = balance;
        this.creditScore = creditScore;
        this.isFrozen = isFrozen;

        if (balance >= -50000)
        {
            isFrozen = false;
        }
        else
        {
            isFrozen = true;
        }
    }

    public void withdraw(float withd)
    {
        if (isFrozen == true)
        {
            System.out.println("The account is frozen! No withdrawal allowed.");
        }
        else
        {
            balance -= withd;
        }
    }

    public void deposit(float dep)
    {
        balance += dep;
        if (balance >= -50000 && isFrozen == true)
        {
            isFrozen = false;
        }
    }

    public void checkBalance()
    {
        if (balance < -50000)
        {
            isFrozen = true;
        }
        else if (balance < -10000)
        {
            creditScore -= 10;
        }
    }

}
