import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tableau1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int[] tab = new int[6];

        do {
            System.out.print("Entrez un nombre: ");
            int nombreEntree = sc.nextInt();
            tab[i] = nombreEntree;
            i++;
        }while( i < tab.length);

        System.out.printf(Arrays.toString(tab));

    }
}