package Week7Homework;

import java.util.Scanner;

public class Pro10AddSubMuliDivWithSymbol {
/*
10.Write a java program to input any two number and ask user to enter their symbol
    (+, -,  /, *) find addition, Subtraction, multiplication and division
    according to their symbol  (using if else)
*/

    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int number1 = input.nextInt();
        System.out.println("Enter Second number :");
        int number2 = input.nextInt();
        System.out.println("Enter the operator you Want");// input operator
        ch = input.next().charAt(0); // this will convert any string to char
        if (ch == '+') {
            System.out.println("\nAddition of " + number1 + "+" + number2 + "=" + (number1 + number2));
        } else if (ch == '-') {
            System.out.println("\nSubstraction of " + number1 + "-" + number2 + "=" + (number1 - number2));
        } else if (ch == '*') {
            System.out.println("\nMultification of " + number1 + "*" + number2 + "=" + (number1 * number2));
        } else if (ch == '/') {
            System.out.println("\n division of " + number1 + "/" + number2 + "=" + (number1 / number2));
        } else {
            System.out.println("Operator is not available");
        }
    }
}
