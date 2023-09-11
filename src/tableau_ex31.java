import java.util.Arrays;
import java.util.Scanner;

public class tableau_ex31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tableau = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.printf("Voici les valeurs: %s%n", Arrays.toString(tableau));

        System.out.print("Entrez la valeur à rechercher: ");
        int valeur = Integer.parseInt(sc.nextLine());

        boolean trouve = false;

        for (int i = 0; i < 10; i++) {
            if (tableau[i] == valeur){
                trouve = true;
                System.out.printf("La valeur %s a été trouvé à la position " + i, valeur);
            }
        }

        if (!trouve) {
            System.out.printf("La valeur %s n'a pas été trouvée dans le tableau.", valeur);
        }
    }
}