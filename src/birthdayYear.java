
import java.util.Scanner;

public class birthdayYear {

    static final int theYear = 2023;
    public static void yearsOld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre année de naissance: ");
        int result1 = scanner.nextInt();
//        System.out.print("Entrez l'année en cours: ");

        int result = theYear - result1;

        System.out.printf("Votre âge est de %s ans", result);



    }

    public static void main(String[] args) {
        yearsOld();
    }
}
