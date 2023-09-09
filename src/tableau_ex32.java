
public class tableau_ex32 {

    public static void main(String[] args) {
        int[] tableau1 = {5, 2, 9, 1, 8};
        int[] tableau2 = {4, 7, 3, 6, 10};
        int[] tableauFusionne = new int[10];

        int i = 0, j = 0, k = 0;

        while (i < 5 && j < 5) {
            if (tableau1[i] <= tableau2[j]) {
                tableauFusionne[k] = tableau1[i];
                i++;
            } else {
                tableauFusionne[k] = tableau2[j];
                j++;
            }
            k++;
        }

        while (i < 5) {
            tableauFusionne[k] = tableau1[i];
            i++;
            k++;
        }

        while (j < 5) {
            tableauFusionne[k] = tableau2[j];
            j++;
            k++;
        }

        System.out.println("Tableau fusionné: ");
        for (int num : tableauFusionne) {
            System.out.print(num + " ");
        }
    }
}