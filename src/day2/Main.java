package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //type scanner

        // Menu
        System.out.println("Choose Exercise:");
        System.out.println("1. Temperature Converter");
        System.out.println("2. CM to KM");
        System.out.println("3. Odd or Even");
        System.out.println("4. Removing Substring");
        System.out.println("5. Palindrom Checker");
        System.out.print("Choose your exercise: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                TemperatureConverter converter = new TemperatureConverter();
                System.out.print("input Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = converter.fahrenheitToCelsius(fahrenheit);
                System.out.println("from : " + fahrenheit + "to : " + celsius);
                break;
            case 2:
                DistanceConverter distanceConverter = new DistanceConverter();
                System.out.print("Input centimeter: ");
                double cm = scanner.nextDouble();
                double km = distanceConverter.cmToKm(cm);
                System.out.println("from : " + cm + " to : " + km + " km");
                break;
            case 3:
                NumberChecker checker = new NumberChecker();
                System.out.print("input Number : ");
                int number = scanner.nextInt();
                boolean isEven = checker.isEven(number);
                System.out.println(isEven);
                break;
            case 4:
                System.out.print("Input Sentence : ");
                scanner.nextLine(); // buang karakter new line
                String str = scanner.nextLine();
                System.out.print("Removing Substring: ");
                String sub = scanner.nextLine();

                StringManipulator manipulator = new StringManipulator();

                // Panggil fungsi untuk menghapus substring
                String result = manipulator.removeSubstring(str,sub);
                System.out.println("Result : " + result);
                break;
            case 5:
                PalindromeChecker palindromeChecker = new PalindromeChecker();
                System.out.print("Input Sentence : ");
                scanner.nextLine();
                String sentence = scanner.nextLine();
                boolean isPalindrome = palindromeChecker.isPalindrome(sentence.toLowerCase());
                System.out.println(sentence + " is " + (isPalindrome ? "palindrome" : "not palindrome"));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}