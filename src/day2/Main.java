package day2;

public class Main {
    public static void main(String[] args) {
        // Soal 1: Fahrenheit ke Celsius
        double fahrenheit = 100;
        double celsius = FahrenheitToCelsius.convert(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        // Soal 2: Centimeter ke Kilometer
        double centimeter = 100000;
        String kilometer = CentimeterToKilometer.convert(centimeter);
        System.out.println(centimeter + " cm = " + kilometer);

        // Soal 3: Ganjil atau Genap
        int number = 15;
        System.out.println(number + " adalah bilangan " + (OddOrEven.isOdd(number) ? "ganjil" : "genap"));

        // Soal 4: Hapus Substring
        String str = "Hello world";
        String sub = "ell";
        String result = RemoveSubstring.remove(str, sub);
        System.out.println("Hasil: " + result);

        // Soal 5: Palindrome
        String palindrome = "madam";
        System.out.println(palindrome + " adalah palindrome: " + PalindromeChecker.isPalindrome(palindrome));
    }
}
