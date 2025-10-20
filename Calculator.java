import java.util.*;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot perform modulus by zero!");
            return 0;
        }
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operator;
        String continueCalc;
        System.out.println("=== Simple Calculator ===");

        do {
            System.out.print("\nEnter first number: ");
            int a = sc.nextInt();

            while (true) {
                System.out.print("Enter the operator (+, -, *, /, %): ");
                operator = sc.next();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")) {
                    break;
                } else {
                    System.out.println("Invalid operator! Try again.");
                }
            }

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (operator) {
                case "+": 
                    System.out.println("Sum: " + add(a, b)); 
                    break;
                case "-": 
                    System.out.println("Difference: " + sub(a, b)); 
                    break;
                case "*": 
                    System.out.println("Product: " + mul(a, b)); 
                    break;
                case "/": 
                    System.out.println("Quotient: " + div(a, b)); 
                    break;
                case "%": 
                    System.out.println("Modulus: " + mod(a, b)); 
                    break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            continueCalc = sc.next();

        } while (continueCalc.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the calculator.");
        sc.close();
    }
}
