
import java.util.Scanner;

public class birthdayYear {
    public static void yearsOld() {
        int theYear;
        int result1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez l'année en cours: ");
        theYear = sc.nextInt();
        System.out.print("Entrez votre année de naissance: ");
        result1 = sc.nextInt();
        int result = theYear - result1;


        System.out.printf("Votre âge est de %s ans", result);
    }

    public static void main(String[] args) {
        yearsOld();
    }
}
