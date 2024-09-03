package day2;

public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
}