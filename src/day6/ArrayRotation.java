package day6;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation {
    /**Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static int array(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Question 3 : Check Largest Element ");
        System.out.print("input digit Array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Input element Array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr[arr.length-1];
    }


}

