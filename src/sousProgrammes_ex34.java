import java.util.Scanner;

public class sousProgrammes_ex34 {
    private final static Scanner sc = new Scanner(System.in);
    public static int search(int[] arr, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i; // Renvoie l'indice si l'élément est trouvé
            }
        }
        return -1; // Renvoie -1 si l'élément n'est pas trouvé
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.print("Veuillez entrez un nombre: ");
        int target = sc.nextInt();
        int result = search(myArray, myArray.length, target);

        if (result != -1) {
            System.out.println("L'élément " + target + " se trouve à l'indice " + result);
        } else {
            System.out.println("L'élément " + target + " n'a pas été trouvé dans le tableau.");
        }
    }
}