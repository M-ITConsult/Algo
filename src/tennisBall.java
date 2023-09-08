import java.util.Scanner;

public class tennisBall {
    public static void result() {
        Scanner sc = new Scanner(System.in);

        int stockBalls = 10;

        System.out.print("Pour lancer une balle taper 1: ");
        int ready = sc.nextInt();
        if(ready == 1) System.out.println("Vous lancer une balle!");

        while (true) {
            if (stockBalls > 1) {
                System.out.println("Vous pouvez lancer encore une balle");
                stockBalls--;
            } else {
                System.out.println("Votre panier est vide");break;
            }
        }
    }

    public static void main(String[] args) {
        result();
    }
}
