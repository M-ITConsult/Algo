import java.util.Scanner;

public class passwordConnect {
    final static String myPassword = "password1234";
    static int attempts;
    static int max_attempts = 4;

    private static void connexionDisplay() {
        Scanner sc = new Scanner(System.in);

       do {
           if (attempts < max_attempts) {
               System.out.print("Enter you password: ");
               String password = sc.next().toLowerCase();

               if(!password.equals(myPassword)) {
                   System.out.println("Invalid password!");
               }

               if (password.equals(myPassword)) {
                   System.out.println("Hello :)");
                   break;
               } else {
                   attempts++;
                   System.out.println("You have " + (max_attempts - attempts) + " attempts left.");
               }
           }

           if (attempts == max_attempts) {
               System.out.println("GoodBye! Your are not welcome!");
               break;
           }
       } while(true);
    }

    public static void main(String[] args) {
        connexionDisplay();
    }
}
