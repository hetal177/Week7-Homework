package Week7Homework;

import java.util.Scanner;
//1. Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)


public class Pro1OddEven1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// imported jave utill class
        System.out.println("enter number");
        int number = input.nextInt();
        String result = number % 2 == 0 ? "Even" : "odd";//ternary operator
        System.out.println(number + " is " + result);
        input.close(); // scanner closed

    }


}
