import java.util.Scanner;

public class tableau_ex29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] tableau = {'P','_','_','_','_','_','_','_','_','_'};
        int positionPion = 0;

        System.out.println("Tableau actuel: " + new String(tableau));

        char deplacement;

        do {
            System.out.print("Choisissez un déplacement (g pour gauche, d pour droite, q pour quitter): ");
            deplacement = sc.next().charAt(0);

            switch (deplacement) {
                case 'g' -> {
                    if (positionPion > 0) {
                        tableau[positionPion] = '_';
                        positionPion--;
                        tableau[positionPion] = 'P';
                    } else {
                        System.out.println("Déplacement impossible vers la gauche.");
                    }
                }
                case 'd' -> {
                    if (positionPion < 9) {
                        tableau[positionPion] = '_';
                        positionPion++;
                        tableau[positionPion] = 'P';
                    } else {
                        System.out.println("Déplacement impossible vers la droite.");
                    }
                }
                case 'q' -> {
                }
                default -> System.out.println("Déplacement invalide.");
            }
            System.out.println("Tableau actuel: " + new String(tableau));
        } while (deplacement != 'q');
    }
}