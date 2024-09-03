package day2;

public class StringManipulator {
    public String removeSubstring(String str, String sub) {
        // Implementasi metode untuk menghapus substring
        // Salah satu cara: menggunakan replace()
        return str.replace(sub, "");
    }
}