package day3;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        // Mengubah kedua string menjadi huruf kecil semua dan mengurutkannya
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Membandingkan kedua array karakter
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}
