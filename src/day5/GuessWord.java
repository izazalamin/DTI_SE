package day5;

import java.util.Scanner;
import java.util.Random;

public class GuessWord {
    private String[] words = {"ronaldo", "messi", "benzema","mudryk","nunez"}; // Daftar kata
    private String hiddenWord;
    private int attempts = 6; // Jumlah percobaan

    // Method to select a random word
    public String selectRandomWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    // Method to hide the word with underscores
    public String hideWord(String word) {
        StringBuilder hidden = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            hidden.append("_");
        }
        return hidden.toString();

    }

    // Method to get player's guess
    public char getPlayerGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the word : ");
        return scanner.next().charAt(0);
    }

    // Method to check if guess is correct
    public boolean isGuessCorrect(String word, char guess) {
        return word.indexOf(guess) != -1;
    }

    // Method to update hidden word based on guess
    public String updateHiddenWord(String word, String hiddenWord, char guess) {
        StringBuilder newHiddenWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                newHiddenWord.append(guess);
            } else {
                newHiddenWord.append(hiddenWord.charAt(i));
            }
        }
        return newHiddenWord.toString();
    }

    // Method to display the game result
    public void displayGameResult(String word, String hiddenWord) {
        if (hiddenWord.equals(word)) {
            System.out.println("Gratz you win!");
        } else {
            System.out.println("Sadly you lose. the true word is : " + word);
        }
    }

    // Method to play the entire game
    public void playGame() {
        hiddenWord = hideWord(selectRandomWord());
        while (attempts > 0 && !hiddenWord.equals(words[0])) {
            System.out.println(hiddenWord);
            char guess = getPlayerGuess();
            if (isGuessCorrect(words[0], guess)) {
                hiddenWord = updateHiddenWord(words[0], hiddenWord, guess);
            } else {
                attempts--;
                System.out.println("Zonk! Remaining trials: " + attempts);
            }
        }
        displayGameResult(words[0], hiddenWord);
    }
}
