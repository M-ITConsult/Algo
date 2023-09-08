import java.util.Scanner;

public class plusoumoins {

    public static void justPrice(){

        Scanner sc = new Scanner(System.in);

        int theNumber = (int) (Math.random() * 100 + 1);
        int playerGuess = 0;

        while (playerGuess != theNumber) {

            System.out.print("Guess a number between 1 and 100: ");
            playerGuess = sc.nextInt();

            if (playerGuess < theNumber)
                System.out.println(playerGuess + " is too low. Try again.");
            else if (playerGuess > theNumber)
                System.out.println(playerGuess + " is too high. Try again.");
            else
                System.out.println("You win!");
        }
    }

    public static void main(String[] args) {
            justPrice();
    }
}
