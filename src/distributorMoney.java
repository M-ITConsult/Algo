import java.util.Scanner;

public class distributorMoney {
    static int compteBancaire = 2500;
    static int billetDeDeuxCent = 200;
    static int billetDeCent = 100;
    static int billetdeCinquante = 50;
    static int billetdeVingt = 20;
    static int billetdeDix = 10;
    static int billetdeCinq = 5;
//    static int stockVingt = 20;
    public static void distributor() {


        Scanner sc = new Scanner(System.in);
        System.out.printf("Solde actuel sur votre compte: %s€%n", compteBancaire);
        System.out.println("Combien voulez-vous retirer? ");


        do {
            System.out.println("\n1. 200€\n2. 100€\n3. 50€\n4. 20€\n5. 10€\n6. 5€\n7. Montant personnalisé\n8. Retirer votre carte");
            int select = Integer.parseInt(sc.next());

            switch (select) {
                case 1 -> {
                    if (billetDeDeuxCent <= compteBancaire) {
                        compteBancaire -= billetDeDeuxCent;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", billetDeDeuxCent, compteBancaire);
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 2 -> {
                    if (billetDeCent <= compteBancaire) {
                        compteBancaire -= billetDeCent;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", billetDeCent, compteBancaire);
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 3 -> {
                    if (billetdeCinquante <= compteBancaire) {
                        compteBancaire -= billetdeCinquante;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", billetdeCinquante, compteBancaire);
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 4 -> {
                    if (billetdeVingt <= compteBancaire) {
                        compteBancaire -= billetdeVingt;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", billetdeVingt, compteBancaire);
//                        stockVingt--;
//                        if (stockVingt < 1){
//                            System.out.println("Plus de billets de 20€");
//                            distributor();
//                        }
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 5 -> {
                    if (billetdeDix <= compteBancaire) {
                        compteBancaire -= billetdeDix;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", billetdeDix, compteBancaire);
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 6 -> {
                    if (billetdeCinq <= compteBancaire) {
                        compteBancaire -= billetdeCinq;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", billetdeCinq, compteBancaire);
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 7 -> {
                    System.out.print("Entrez le montant souhaité: ");
                    int montantEntree = Integer.parseInt(sc.next());
                    if (montantEntree <= compteBancaire) {
                        compteBancaire -= montantEntree;
                        System.out.printf("%s€ retiré. Nouveau solde: %s€%n", montantEntree, compteBancaire);
                    } else {
                        System.out.println("Fonds insuffisant! Reprenez votre carte...");
                        System.exit(0);
                    }
                }

                case 8 -> {
                    System.out.println("GoodBye!");
                    System.exit(0);}
            }

        } while (true);
    }

    public static void main (String[]args){
        distributor();
    }
}