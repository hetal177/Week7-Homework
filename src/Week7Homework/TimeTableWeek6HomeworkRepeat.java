package Week7Homework;

import java.util.Scanner;

public class TimeTableWeek6HomeworkRepeat {
  //repeat homework from week6
   // write a java program that takes a number as input anf print its multification table up to 10


        public static void main(String[] args) {
            int i,k;
           Scanner SC = new Scanner(System.in);
            System.out.println("Enter the number for the table");
            int n = SC.nextInt();
            for (i=1;i<=10;i++){
                k=n*i;
                System.out.println(n+"*" + i + "=" + k);
            }

        }
    }


