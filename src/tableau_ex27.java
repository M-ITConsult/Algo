import java.util.Arrays;
import java.util.Scanner;

public class tableau_ex27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] entiers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Entrez un entier: ");
            entiers[i] = Integer.parseInt(sc.nextLine());
        }

        int min = entiers[0];

        for (int i = 1; i < 10; i++) {
            if (entiers[i] < min) {
                min = entiers[i];
            }
        }

        System.out.printf("Le plus petit entier est: %s", min);
    }
}