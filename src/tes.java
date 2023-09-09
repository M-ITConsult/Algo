import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        do {
            System.out.print("Age?: ");
            age = sc.nextInt();
                    if(age >= 18){System.out.println("OK");}else{
                        System.out.println("No");
                    }

        } while (true);



    }
}
