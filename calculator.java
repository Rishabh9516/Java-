import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = sc.nextDouble();

        // Input operation
        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("Enter the operation number: ");
        int operation = sc.nextInt();

        double result;

        // Perform the selected operation
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                result = a % b;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation number");
        }
    }
}
