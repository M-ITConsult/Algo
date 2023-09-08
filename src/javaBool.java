import java.util.Scanner;

// Cours du 01/09/2023
public class javaBool {

    public static void bool() {
        int poointsJean = 15;
        int pointsPaul = 9;

        boolean reussiteJean = (poointsJean >= 10);
        boolean reussitePaul = (pointsPaul >= 10);

        System.out.printf("Est-ce que Jean à réussi? -> %s\n", reussiteJean);
        System.out.printf("Est-ce que Paul à réussi? -> %s\n", reussitePaul);
        System.out.printf(String.valueOf("Souris" == "Souris")+ "\n");

        if (!reussitePaul) {
            System.out.println("Tu as perdu!");
        } else {
            System.out.println("Tu as gagné!");
        }


    }
    public static void where() {
        // ou

        int age2 = 18;
        boolean emancipation = false;

        boolean acces2 = (age2 >= 18 || emancipation);
        System.out.printf("Droits d'accès: %s\n", acces2);
    }
    public static void ex1() {
       int a = 3;
       int b = 9;
       boolean c = false;
       boolean d = !c;
       int e = 9;

        boolean r1 = a > 8;
        System.out.printf("A>8? %s\n", r1);
        boolean r2 = b == 9;
        System.out.printf("B==9? %s\n", r2);
        boolean r3 = (!(a!= 3));
        System.out.printf("(NON(A != 3))? %s\n", r3);
        boolean r4 = (!(c));
        System.out.printf("(NON(C))? %s\n", r4);
        boolean r5 = ((a < b) || c);
        System.out.printf("((A < B) OU C)? %s\n", r5);
        boolean r6 = !((a + b)!=12);
        System.out.printf("NON((A + B) != 12)? %s\n", r6);
        boolean r7 = ((b == 5) || (e > 10) && (a < 8 ));
        System.out.printf("((B == 5) OU ( (E > 10) ET (A < 8) ))? %s\n", r7);
        boolean r8 = ((((b == 5) || ((e > 10) && (a < 8))) && (a < b) || c) && c);
        System.out.printf("((((B == 5) OU ((E > 10) ET (A < 8))) OU (A < B) OU C) ET C)? %s\n", r8);
        boolean r9 = a!=3;
        System.out.printf("A != 3? %s\n",r9);
        boolean r10 = !(d) || c;
        System.out.printf("!(D) || C? %s", r10);
        boolean r11 = ((a + b) == 12) && d;
        System.out.printf("((A + B) == 12) && D? %s\n", r11);




    }
    public static void sinon() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Entrez votre âge: ");
        int age = Integer.parseInt(sc.nextLine());
              if (age >= 18) {
                  System.out.println("Hello");
              } else {
                  System.out.println("No thanks!");
              }
    }
    public static void main(String[] args) {
        bool();
        where();
        ex1();
        sinon();
    }
}
