public class multiplicator {



    public static void main(String[] args) {
        int nombre = 2;
        int multiplicateur = 0;

        while(multiplicateur <= 10) {
            System.out.printf("%s x %s = " + (nombre * multiplicateur) + " \n",nombre ,multiplicateur);
            multiplicateur++;
        }
    }
}