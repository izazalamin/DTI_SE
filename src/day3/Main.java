package day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        int jumlahDigit = DigitCounter.countDigits(angka);
        System.out.println("Jumlah digit dari " + angka + " adalah: " + jumlahDigit);

        // no 2
        System.out.print("Masukkan angka: ");
        int number = scanner.nextInt();

        boolean isPrime = PrimeChecker.isPrime(number);
        System.out.println(number + " adalah bilangan prima: " + isPrime);

        //no 3
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = FindLargest.findLargestElement(arr);
        System.out.println("Elemen terbesar dalam array adalah: " + largest);

        // no 4
        Kalkulator kalkulator = new Kalkulator();

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        try {
            double hasil = kalkulator.hitung(operator, bilangan1, bilangan2);
            System.out.println("Hasil: " + hasil);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        //no 5
        System.out.print("Masukkan sebuah string: ");
        scanner.nextLine();
        String str = scanner.nextLine();

        StringReverser reverser = new StringReverser();
        String reversedStr = reverser.reverse(str);

        System.out.println("String yang dibalik: " + reversedStr);

        //no6
        System.out.print("Masukkan jumlah suku deret Fibonacci: ");
        int x = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        int[] deret = fibonacci.generateFibonacci(x);

        System.out.print("Deret Fibonacci: ");
        for (int num : deret) {
            System.out.print(num + " ");}

        //no 7
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        VocalCounter counter = new VocalCounter();
        int jumlahVokal = counter.countVowels(kalimat);

        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        //no 8
            System.out.print("Masukkan jumlah elemen: ");
            int y = scanner.nextInt();

            int[] ar = new int[n]; // Remove the extra semicolon

            System.out.println("Masukkan elemen:");
            for (int i = 0; i < y; i++) {
                ar[i] = scanner.nextInt();
            }

            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(ar);

            System.out.println("Array yang telah terurut:");
            for (int i = 0; i < n; i++) {
                System.out.print(ar[i] + " ");
            }
        //no 9
            AnagramChecker checker = new AnagramChecker();

            System.out.print("Masukkan string pertama: ");
            String str1 = scanner.nextLine();
            System.out.print("Masukkan string kedua: ");
            String str2 = scanner.nextLine();

            boolean isAnagram = checker.isAnagram(str1, str2);

            if (isAnagram) {
                System.out.println("Kedua string adalah anagram.");
            } else {
                System.out.println("Kedua string bukan anagram.");
            }
        //no 10
            System.out.print("Masukkan jumlah elemen: ");
            int a = scanner.nextInt();

            int[] ara = new int[a];
            System.out.println("Masukkan elemen-elemen array:");
            for (int i = 0; i < a; i++) {
                ara[i] = scanner.nextInt();
            }

            ArrayProcessor processor = new ArrayProcessor();
            int secondLargest = processor.findSecondLargest(arr);

            System.out.println("Elemen terbesar kedua: " + secondLargest);

    }
}
