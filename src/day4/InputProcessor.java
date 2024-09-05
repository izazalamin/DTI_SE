package day4;
import java.util.Scanner;

public class InputProcessor {
    public void processInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        double number;
        input = scanner.nextLine();

        // Cek apakah input adalah angka atau karakter
        if (input.equalsIgnoreCase("y")) {
            continue; // Lanjutkan perulangan
        } else if (input.equalsIgnoreCase("n")) {
            break; // Keluar dari perulangan
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