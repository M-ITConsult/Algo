import java.util.Scanner;

public class tableau_ex28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tab = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.print("Entrez la valeur à rechercher: ");
        int valeur = Integer.parseInt(sc.nextLine());

        int position = -1;
        boolean trouve = false;

        for(int i = 0; i < 10; i++) {
            if (tab[i] == valeur) {
                position = i;
                trouve = true;
                break;
            }
        }

        if (trouve) {
            System.out.printf("La valeur %s a été trouvée à la position %s", valeur, position);
        } else {
            System.out.printf("La valeur %s n'a pas été trouvé dans le tableau.");
        }

    }
}