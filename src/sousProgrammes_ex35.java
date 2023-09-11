public class sousProgrammes_ex35 {

    public static int[] fusionTab(int[] tab1, int[] tab2) {
        int taille1 = tab1.length;
        int taille2 = tab2.length;
        int[] tabFusion = new int[taille1 + taille2];

        for (int i = 0; i < taille1; i++) {
            tabFusion[i] = tab1[i];
        }

        for (int i = 0; i < taille2; i++) {
            tabFusion[i + taille1] = tab2[i];
        }

        return tabFusion;
    }
    public static void main(String[] args) {
            int[] tab1 = {1, 2, 3};
            int[] tab2 = {4, 5, 6};

            int[] tabFusion = fusionTab(tab1, tab2);

            for (int element : tabFusion) {
                System.out.println(element + " ");
            }
    }
}
