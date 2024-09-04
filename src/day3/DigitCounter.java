package day3;

import java.util.Scanner;

public class DigitCounter {
    public static int countDigits(int number) {
        String numberString = Integer.toString(number);
        int[] digits = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }
}
