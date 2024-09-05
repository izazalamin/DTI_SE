package day4;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public void play() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess, count = 0;

        do {
            System.out.print("Try to guess a number (1-100): ");
            guess = scanner.nextInt();
            count++;

            if (guess < secretNumber) {
                System.out.println("Too small!");
            } else if (guess > secretNumber) {
                System.out.println("Terlalu big!");
            } else {
                System.out.println("Gratttzz , u can guessing my number with  " + count + " trial.");
            }
        } while (guess != secretNumber);
    }
}

