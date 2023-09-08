public class multiplicator1 {



    public static void main(String[] args) {

            int nombre = 1;
            int compteur = 1;
            int resultat;

            while(nombre <= 9){
                System.out.printf("---------Table de %s---------%n", nombre);
                while(compteur <= 10){
                    resultat = nombre * compteur;
                    System.out.printf("%s * %s = %s%n", nombre, compteur, resultat);
                    compteur++;
                }
                compteur = 1;
                nombre++;
            }
        }
    }