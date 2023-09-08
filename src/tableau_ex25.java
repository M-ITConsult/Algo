import java.util.Arrays;

public class tableau_ex25 {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        for(int i = 0; i < tab.length / 2; i++) {
            int reverse = tab[i];
            tab[i] = tab[tab.length - i - 1];
            tab[tab.length - i - 1] = reverse;
        }

        System.out.printf("Le nouveau tableau est: %s",Arrays.toString(tab));
    }
}