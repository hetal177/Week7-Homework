package Week7Homework;

import java.util.Scanner;

public class Pro6OddEven {


        /*
        Write a java program to input any number and find out if it’s odd or even
         */
        public static void main(String[] args) {
            int num;
            System.out.println("Enter an Integer number:");
            //The input provided by user is stored in num
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if (num % 2 == 0)
                System.out.println("Enter number is even");
            else
                System.out.println("Enter number is odd.");

        }
    }

