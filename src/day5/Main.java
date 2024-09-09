package day5;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //no 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose question:");
        System.out.println("1. Guess word");
        System.out.println("2. Currency");
        System.out.println("3. Removing odd");
        System.out.println("4. FizzBuzz");
        System.out.println("5. num + target");
        System.out.println("Input your option : ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                GuessWord guessWord = new GuessWord();
                guessWord.playGame();
                scanner.close();
                break;
            //no 2
            case 2 :
                // Exchange rates (using a 2D array for better organization)
                double[][] exchangeRates = {
                        {1, 0.92, 0.79, 147.65}, // USD to USD, EUR, GBP, JPY
                        {1/0.92, 1, 1/0.79, 147.65/0.92}, // EUR to USD, EUR, GBP, JPY
                        {1/0.79, 1/0.79*0.92, 1, 147.65/0.79}, // GBP to USD, EUR, GBP, JPY
                        {1/147.65, 0.92/147.65, 0.79/147.65, 1} // JPY to USD, EUR, GBP, JPY
                };

                // Get user input
                System.out.print("Enter the amount to convert: ");
                double amount = scanner.nextDouble();
                System.out.print("Enter the source currency (USD, EUR, GBP, or JPY): ");
                String sourceCurrency = scanner.next().toUpperCase();
                System.out.print("Enter the target currency (USD, EUR, GBP, or JPY): ");
                String targetCurrency = scanner.next().toUpperCase();

                // Convert currencies (using indices for efficiency)
                int sourceIndex = "USD".indexOf(sourceCurrency);
                int targetIndex = "USD".indexOf(targetCurrency);
                double convertedAmount = amount * exchangeRates[sourceIndex][targetIndex];

                // Display result
                System.out.println(amount + " " + sourceCurrency + " is " + convertedAmount + " " + targetCurrency);
                break;
            case 3 :
                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();
                int[] numbers = new int[n];
                System.out.print("Enter the elements of the array (separated by spaces): ");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }

                RemoveOdd removeOdd = new RemoveOdd();
                int[] evenNumbers = removeOdd.removeOddNumbers(numbers);
                System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
                break;
            case 4 :
                System.out.print("Enter the value of n: ");
                n = scanner.nextInt();
                FizzBuzz fizzBuzz = new FizzBuzz();
                fizzBuzz.fizzBuzz(n);
                break;
            case 5 :
                System.out.print("Enter the value of n: ");
                int[] x = scanner.nextInt();
                TwoSum sum = new TwoSum();
                sum.twoSum(x);
                break;
        }
    }
}
