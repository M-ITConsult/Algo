
import java.util.Scanner;

public class birthdayYear {

    static final int theYear = 2023;
    public static void yearsOld() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello, nous sommes en %s, pour changer l'année courante," +
                " vous devez le changer dans le programme.%n", theYear);
        System.out.print("Entrez votre année de naissance: ");
        int result1 = scanner.nextInt();
        int result = theYear - result1;

        System.out.printf("Votre âge est de %s ans", result);
    }

    public static void main(String[] args) {
        yearsOld();
    }
}
