import java.util.Scanner;

public class distributorMoney {

    public static void distributor() {
        int stockBilletdeVingt = 10;
        int stockBilletdeDix = 10;
        int stockBilletdeCinq = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Combien voulez-vous retirer? ");


        do {
            System.out.println("1. 20€\n 2. 10€\n 3. 5€\n4. Retirer votre carte");
            int select = Integer.parseInt(sc.nextLine());

            if (select == 4) {System.out.println("Goodbye!");break;}

            switch (select) {
                case 1 -> {
                    if (stockBilletdeVingt > 1) {
                        System.out.println("Veuillez retirer votre argent!");
                        stockBilletdeVingt--;
                    } else {
                        System.out.println("Il n'y a plus de billet de 20€");
                    }
                }
                case 2 -> {
                    if (stockBilletdeDix > 1) {
                        System.out.println("Veuillez retirer votre argent!");
                        stockBilletdeDix--;
                    } else {
                        System.out.println("Il n'y a plus de billet de 10€");
                    }
                }
                case 3 -> {
                    if (stockBilletdeCinq > 1) {
                        System.out.println("Veuillez retirer votre argent!");
                        stockBilletdeCinq--;
                    } else {
                        System.out.println("Il n'y a plus de billet de 5€");
                    }
                }
            }

        } while (true);
    }

    public static void main (String[]args){
        distributor();
    }
}