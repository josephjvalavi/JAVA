package com.company;

import java.io.*;
import java.util.Scanner;


class Authentication
{
    String name,pass;
    void read()throws UserException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your username: ");
        name = sc.nextLine();
        System.out.println("enter the password: ");
        pass = sc.nextLine();
        if(!name.equals("joseph") && !pass.equals("password"))throw new UserException();
        else if(name.equals("joseph") && !pass.equals("password"))throw new UserException();
        else if(!name.equals("joseph") && pass.equals("password"))throw new UserException();
        else
        {
            System.out.println("Authentication Successful");
        }
    }
    public static void main(String args[])
    {
        Authentication obj=new Authentication();
        try
        {
            obj.read();
        }
        catch(UserException e)
        {
            e.show();
        }
    }
}

class UserException extends Exception
{
    void show()
    {
        System.out.println("Authentication Failed");
    }
}




