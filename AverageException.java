package com.company;

import java.io.*;
import java.util.Scanner;

class Average
{
    int l;
    float avg,n,sum=0;
    void read()throws NegativeException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        l = sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            if(n<0)throw new NegativeException();
            else
            {3
                System.out.println("Enter " +i +"Number" );
                n = sc.nextInt();
                sum=sum+n;
            }
        }
        avg=sum/l;
        System.out.println("average is: "+avg);
    }
    public static void main(String args[])
    {
        Average obj= new Average();
        try
        {
            obj.read();
        }
        catch(NegativeException e)
        {
            e.show();
        }

    }
}

class NegativeException extends Exception
{
    void show()
    {
        System.out.println("enter a positive number");
    }
}


