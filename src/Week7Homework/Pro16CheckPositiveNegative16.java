package Week7Homework;

import java.util.Scanner;

public class Pro16CheckPositiveNegative16 {
  //  Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”


    public static void main(String[] args)
    {
        int num;
//object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
//input from user
        num = sc.nextInt();
//checks the number is greater than 0 or not
        if(num>0)
        {
            System.out.println("The number is positive.");
        }
//checks the number is less than 0 or not
        else if(num<0)
        {
            System.out.println("The number is negative.");
        }
//when above both  conditions return false then its zero
        else
        {
            System.out.println("The number is zero.");
        }
    }
}



