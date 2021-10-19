package Week7Homework;

import java.util.Scanner;

public class Pro2LeapYear2 {
  // 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?


    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("enter any year");
        year = input.nextInt();
        input.close();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) // logic to calculate leap year
        {
        System.out.println(year + " is Leap year");
    }
    else

    {
        System.out.println( year + " is not leap year");

    }

}
}

