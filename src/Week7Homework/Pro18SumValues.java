package Week7Homework;

public class Pro18SumValues {
   // Write a Java program to sum values of an array.

    public  static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i; // is short hand for sum=sum+i; in word " set sum equal to itself plus i
        System.out.println("The sum is " + sum);
    }
}




