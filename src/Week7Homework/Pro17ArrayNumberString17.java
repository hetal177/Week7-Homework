package Week7Homework;

import java.util.Arrays;

public class Pro17ArrayNumberString17 {
    /*Write a Java program to sort a numeric array
    and a string array.*/

    public static void main(String[] args) {

        int[] array1 = {
                1,0,3,4,9,6,26,54,54,12};

        String[] array2 = {
                "J",
                "A",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array1));

        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));
    }
}