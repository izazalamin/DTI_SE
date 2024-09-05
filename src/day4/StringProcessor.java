package day4;

public class StringProcessor {
    public String swapCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else
            {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }
}

