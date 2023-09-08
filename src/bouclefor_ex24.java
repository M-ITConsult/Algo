import java.util.Scanner;

public class bouclefor_ex24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberPlayers;
        int[] score = new int[10];
        int total = 0;

        System.out.print("Entrez le nombre de joueurs (max 10): ");
        numberPlayers = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberPlayers; i++) {
            System.out.print("Entrez le score du joueur " + (i+1) + " : ");
            score[i] = Integer.parseInt(sc.nextLine());
            total += score[i];
        }

        double moyenne = (double) total / numberPlayers;

        System.out.printf("La moyenne des scores est: %s", moyenne);
    }
}