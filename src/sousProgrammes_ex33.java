public class sousProgrammes_ex33 {

    public static int calculeCarre(int number){
           return number * number;
    }

    public static void main(String[] args) {
        int number = 2;
        int result = calculeCarre(number);
        System.out.printf("Le carré de %s est de %s", number, result);
    }
}
