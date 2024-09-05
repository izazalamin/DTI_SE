package day4;
import java.util.Scanner;

public class InputProcessor {
    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        double number;

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                continue; // Lanjutkan ke iterasi berikutnya
            } else if (input.equalsIgnoreCase("n")) {
                break; // Keluar dari loop
            } else {
                try {
                    number = Double.parseDouble(input);
                    System.out.println("Angka yang dimasukkan: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka atau y/n.");
                }
            }
        }
    }
}