package amol;

import java.util.Scanner;

class BadEyesight extends Exception
{
    BadEyesight(String str)
    {
        super(str);
    }
}
class InvalidNationality extends Exception
{
    InvalidNationality(String str)
    {
        super(str);
    }
}
class InvalidAge extends Exception
{
    InvalidAge(String str)
    {
        super(str);
    }
}
public class Assignment8 {
    public static void method()
    {
        Scanner keyboard=new Scanner(System.in);

       String nationality= "Indian";
        System.out.println("Enter Your Age");
        int age = keyboard.nextInt();
        System.out.println("Enter Your Eyesight out of 20");
        int eyesight =keyboard.nextInt();

        try {
            if (nationality ==null)
                throw new InvalidNationality("You have not entered the proper nationality");

            if(age<18)
                throw new InvalidAge("You are not old enough to drive");

            if(eyesight<12)
                throw new BadEyesight("You don't have good enough Eye Sight for Driving");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){

        try {
            method();
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside the finally");
        }
    }
}