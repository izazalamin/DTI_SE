package day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //no 1
        System.out.print("Question 1 : sum of digits ");
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        int sumDigit = DigitCounter.countDigits(num);
        System.out.println("Sum digit " + num + " is : " + sumDigit);

        // no 2
        System.out.print("Question 2 : Prime Checker ");
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        boolean isPrime = PrimeChecker.isPrime(number);
        System.out.println(number + " is Prime " + isPrime);

        //no 3
        System.out.print("Question 3 : Check Largest Element ");
        System.out.print("input digit Array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Input element Array (with space):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = FindLargest.findLargestElement(arr);
        System.out.println("Biggest number on array: " + largest);

        // no 4
        System.out.print("Question 4 : Simple Calculator ");
        Calculator calculator = new Calculator();

        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Input the last number: ");
        double num2 = scanner.nextDouble();

        try {
            double result = calculator.count(operator,num1,num2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }

        //no 5
        System.out.print("Question 5 : Reversing String ");
        System.out.print("Input a sentence ");
        scanner.nextLine();
        String str = scanner.nextLine();

        StringReverser reverser = new StringReverser();
        String reversedStr = reverser.reverse(str);

        System.out.println("Reversed Sentence: " + reversedStr);

        //no6
        System.out.print("Question 6 : Fibonacci Seq");
        System.out.print("Input sum Fibonacci Seq: ");
        int x = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        int[] deret = fibonacci.generateFibonacci(x);

        System.out.print("Fibonacci Seq: ");
        for (int bil : deret) {
            System.out.print(bil + " ");}

        //no 7
        System.out.print("Question 7 : Total Vowels on sentence ");
        System.out.print("Input a sentence: ");
        scanner.nextLine();
        String kalimat = scanner.nextLine();

        VocalCounter counter = new VocalCounter();
        int sumVocal = counter.countVowels(kalimat);

        System.out.println("Total Vocal: " + sumVocal);

        //no 8
        System.out.print("Question 8 : Sorting Array ");
            System.out.print("Input Array digit: ");
            int y = scanner.nextInt();

            int[] ar = new int[n]; // Remove the extra semicolon

            System.out.println("input Array Element:");
            for (int i = 0; i < y; i++) {
                ar[i] = scanner.nextInt();
            }

            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(ar);

            System.out.println("Sorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(ar[i] + " ");
            }
        //no 9
        System.out.print("Question 9 : Anagram Checker ");
            AnagramChecker checker = new AnagramChecker();

            System.out.print("Input First String: ");
            String str1 = scanner.nextLine();
            System.out.print("Input Second String: ");
            String str2 = scanner.nextLine();

            boolean isAnagram = checker.isAnagram(str1, str2);

            if (isAnagram) {
                System.out.println("both is anagram.");
            } else {
                System.out.println("both isn't anagram.");
            }
        //no 10
        System.out.print("Question 10 : Checking Second Smallest Array ");
            System.out.print("Input Digit Element: ");
            int a = scanner.nextInt();

            int[] ara = new int[a];
            System.out.println("Input Array Element:");
            for (int i = 0; i < a; i++) {
                ara[i] = scanner.nextInt();
            }

            ArrayProcessor processor = new ArrayProcessor();
            int secondSmallest = processor.findSecondSmallest(arr);

            System.out.println("The second smallest Array: " + secondSmallest);

    }
}
