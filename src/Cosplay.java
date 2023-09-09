import java.util.Scanner;

public class Cosplay {
    public static void main(String[] args) {

        String JeanC;
        String barbe;

        Scanner sc = new Scanner(System.in);
        System.out.print("Avez-vous une barbe?: ");
        barbe = sc.next();

        if (barbe.equalsIgnoreCase("non")) {
            JeanC = "Legolas";
        } else {
            JeanC = "Aragorn";
        }
        System.out.printf("Votre Cosplay sera: %s", JeanC);
    }
}
