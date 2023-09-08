import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class motusGame {
    String[] words = {"pommes", "banane", "orange"};
    int max_attempts = 10;

    String secretWord;
    char[] guessedLetters;
    int correctAndInPosition;
    int correctButWrongPosition;
    int attempts;
    String playAgain;

    public motusGame(){
        Random rd = new Random();
        secretWord = words[rd.nextInt(words.length)];
        guessedLetters = new char[secretWord.length()];
        Arrays.fill(guessedLetters, '*');
        correctAndInPosition = 0;
        correctButWrongPosition = 0;
        attempts = 0;

    }

    public void play() {
            Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to Motus!");
            System.out.println("Try to guess the word.");

            while (attempts < max_attempts) {
                displayWord();
                System.out.print("Enter your guess: ");
                String guess = sc.next().toLowerCase();

                if (guess.length() != secretWord.length()) {
                    System.out.printf("Invalid guess. The word has %s letters.%n", secretWord.length());
                    continue;
                }

                if (guess.equals(secretWord)) {
                    System.out.printf("Congratulations! You've guessed the world %s%n", secretWord);
                    break;
                } else {
                    updateGuessedWord(guess);
                    attempts++;
                    System.out.printf("Correct letters in the correct position: %s%n", correctAndInPosition);
                    System.out.printf("Correct letters but in the wrong position: %s%n", correctButWrongPosition);
                    System.out.println("You have " + (max_attempts - attempts) + " attempts left.");
                }

            }
            if (attempts == max_attempts) {
                System.out.printf("Game over! The correct word was: %s%n", secretWord);
            }

            System.out.print("Encore un jeu? yes ou no? ");
            playAgain = sc.next();

        } while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
    }

    private void displayWord() {
        System.out.println("Current word: " + new String(guessedLetters));
    }

    private void updateGuessedWord(String guess) {
        correctAndInPosition = 0;
        correctButWrongPosition = 0;

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess.charAt(i)) {
                guessedLetters[i] = guess.charAt(i);
                correctAndInPosition++;
            } else if (secretWord.contains((String.valueOf(guess.charAt(i))))) {
                correctButWrongPosition++;
            }
        }
    }

    public static void main(String[] args) {
        motusGame game = new motusGame();
        game.play();

    }
}
