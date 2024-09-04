package day3;

public class VocalCounter {
    public int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Ubah semua huruf menjadi lowercase agar lebih mudah dibandingkan
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                count++;
            }
        }
        return count;
    }
}
