import java.util.Scanner;

public class tennisBall1 {

    public static void main(String[] args) {
        int nombreBalle = 10;

        Scanner sc = new Scanner(System.in);
        while(nombreBalle != 0) {
        System.out.print("Est-ce que tu es prêt? true - false ");
        boolean pret = Boolean.parseBoolean(sc.nextLine());

        while(!pret) {
            System.out.print("Est-ce que maintenant tu es prêt? ");
        }

        if (pret){
            System.out.println("Lancer de balle dans 2 secondes, attention!");
            nombreBalle--;
        }
        }
    }
}
