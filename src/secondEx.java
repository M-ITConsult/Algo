import java.util.Scanner;

public class secondEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombres de secondes que vous voulez: ");
        int totalSeconds = scanner.nextInt();
        int[] timeComponents = convertSeconds(totalSeconds);

        int days = timeComponents[0];
        int hours = timeComponents[1];
        int minutes = timeComponents[2];
        int seconds = timeComponents[3];

        System.out.printf(" %s secondes correspondent à %s jour(s), %s heure(s), %s minute(s) et %s secondes.",totalSeconds, days, hours, minutes, seconds);
    }

    public static int[] convertSeconds(int seconds) {
        int[] timeComponents = new int[4];

        timeComponents[0] = seconds / 86400; // jours
        seconds %= 86400;
        timeComponents[1] = seconds / 3600;  // heures
        seconds %= 3600;
        timeComponents[2] = seconds / 60;    // minutes
        timeComponents[3] = seconds % 60;    // secondes restantes

        return timeComponents;
    }
}
