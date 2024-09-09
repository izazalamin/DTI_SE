package day5;

import java.util.Scanner;

public class RemoveOdd{
    public static int[] removeOddNumbers(int[] arr) {
        // Count the number of even numbers
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Create a new array to store the even numbers
        int[] evenArray = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }

        return evenArray;
    }
}