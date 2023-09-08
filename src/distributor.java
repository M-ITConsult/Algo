import java.util.Scanner;

public class distributor {
    public static void selector() {

        int stockCoffee = 5;
        int stockTea = 5;
        int stockGinger = 5;
        int stockNuts = 5;
        int stockBarre = 5;
        double priceCoffee = 1.40;
        double priceTea = 1.20;
        double priceGinger = 2.1;
        double priceNuts = 3.5;
        double priceBarre = 2.5;
        Scanner sc = new Scanner(System.in);


        String anotherDrink;
        do {
            System.out.println("1. Café\n2. Thé\n3. Gingembre\n4. Noix bio\n5. Barre énergétique\n6. Exit");
            System.out.print("Veuillez sélectionner le produit que vous souhaitez: ");
            int select = Integer.parseInt(sc.next());

            switch (select) {
                case 1 -> {
                    if (stockCoffee > 1) {
                        System.out.printf("Votre café est prêt! Cela vous fera %s€%n", priceCoffee);
                        stockCoffee--;
                        System.out.printf("Il vous reste désormais %s café en stock.%n", stockCoffee);
                    } else {
                        System.out.println("Plus de café dans la machine!\n");
                    }
                }
                case 2 -> {
                    if (stockTea > 1) {
                        System.out.printf("Votre thé est prêt! Cela vous fera %s€%n", priceTea);
                        stockTea--;
                        System.out.printf("Il vous reste désormais %s thé en stock.%n", stockTea);
                    } else {
                        System.out.println("Plus de thé dans la machine!\n");
                    }
                }
                case 3 -> {
                    if (stockGinger > 1) {
                        System.out.printf("Votre Boisson au gingembre est prête! Cela vous fera %s€%n", priceGinger);
                        stockGinger--;
                        System.out.printf("Il vous reste désormais %s boissons au gingembre en stock.%n", stockGinger);
                    } else {
                        System.out.println("Plus de boissons au gingembre dans la machine!\n");
                    }
                }
                case 4 -> {
                    if (stockNuts > 1) {
                        System.out.printf("Voici votre sachet de noix! Cela vous fera %s€%n", priceNuts);
                        stockNuts--;
                        System.out.printf("Il vous reste désormais %s sachets de noix%n", stockNuts);
                    } else {
                        System.out.println("Plus de sachets de noix dans la machine\n");
                    }
                }
                case 5 -> {
                    if (stockBarre > 1) {
                        System.out.printf("Voici votre barre énergétique! Cela vous fera %s€%n", priceBarre);
                        stockBarre--;
                        System.out.printf("Il vous reste désormais %s barres énergétique%n", stockBarre);
                    } else {
                        System.out.println("Plus de barres énergétique dans la machine\n");
                    }
                }
            }
            System.out.print("Voulez-vous une autre boisson? yes or no? ");
            anotherDrink = sc.next();
        } while (anotherDrink.equalsIgnoreCase("yes"));
        System.out.println("GoodBye!");
    }

    public static void main(String[] args) {
        selector();

    }
}

