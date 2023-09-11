import java.util.Scanner;

public class sousProgrammes_ex36 {
    private static final int capacite_sceau = 17;
    private static final int capacite_marmite = 50;
    static String choice;

    public static void peleurDePatates() {
        Scanner sc = new Scanner(System.in);

        int patatesDansSceau = capacite_sceau;
        int patatesDansMarmite = 0;

        do {
            if (patatesDansSceau > 1) {
                patatesDansSceau--;
                System.out.printf("Il reste %s patates dans le sceau%n", patatesDansSceau);
                if (patatesDansMarmite < capacite_marmite) {
                    patatesDansMarmite++;
                    System.out.printf("Et il y a désormais %s patates dans la marmite.%n", patatesDansMarmite);
                }
            } else {
                System.out.println("Plus de patates! Veuillez remplir le sceau\n");

                System.out.print("Souhaitez-vous remplir le sceau? oui/non ");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("oui")) {
                    patatesDansSceau = capacite_sceau;
                    } else {break;}
                }

            if (patatesDansMarmite == capacite_marmite) {
                System.out.println("La marmite est remplie!");
                break;
            }

            System.out.print("Souhaitez-vous peler une autre patate? oui/non ");
            choice = sc.nextLine();
        } while(choice.equalsIgnoreCase("oui"));
        System.out.println("GoodBye!");
    }

    public static void main(String[] args) {
        peleurDePatates();
    }
}
