import java.util.Arrays;
import java.util.Scanner;

public class tableau_ex30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tableau = {1, 3, 5, 7, 9, 11, 13, 15, 17, 8, 0};

        System.out.print("Entrez la nouvelle valeur à insérer: ");
        int nouvelleValeur = Integer.parseInt(sc.nextLine());

        int position = 0;
        while (position < 10 && tableau[position] < nouvelleValeur){
            position++;
        }

        for (int i = 10; i > position; i--) {
            tableau[i] = tableau[i - 1];
        }

        tableau[position] = nouvelleValeur;

        System.out.printf("Tableau après insertion: %s", Arrays.toString(tableau));
    }
}