import java.util.Random;
import java.util.Scanner;

public class rockpapercissors {
    static String playAgain;
    public static void main(String[] args) {
        String[] rps = {"r", "p", "c"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner sc = new Scanner(System.in);
        String playerMove;
do {
        while(true) {
            System.out.println("Entrez r = pierre, p = papier, c = ciseau ");
            playerMove = sc.next();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("c")) {
                break;
            }
            System.out.println(playerMove + "Entrez non valide");
        }

        System.out.printf("Ordinateur joue: %s%n", computerMove);

        if(playerMove.equals(computerMove)) {
            System.out.println("Le jeu est a égalité!");
        }
        else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("Vous perdez!");

            } else if (computerMove.equals("c")) {
                System.out.println("Vous gagnez!");
            }
        }

        else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("Vous gagnez!");
                }
             else if (computerMove.equals("c")) {
                System.out.println("Vous perdez!");
            }
        }

        else if (playerMove.equals("c")) {
            if (computerMove.equals("p")) {
                System.out.println("Vous gagnez!");
            } else if (computerMove.equals("r")) {
                System.out.println("Vous perdez!");
            }
        }

        System.out.println("Jouez encore? (y/n)");
        playAgain = sc.next();

    } while(playAgain.equalsIgnoreCase("y"));
        System.out.println("GoodBye!");
    }
}
