import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String calculateAgain;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Enter number 1: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter number 2: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.printf("Result: %s%n", result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.printf("Result: %s%n", result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.printf("Result: %s%n", result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("Result: %s%n", result);
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                    }
                }
                default -> System.out.println("Error: Invalid operator");
            }

            System.out.print("Another operation yes or no?");
            calculateAgain = sc.next();

        } while (calculateAgain.equalsIgnoreCase("yes"));

        System.out.println("GoodBye!");
    }
}
