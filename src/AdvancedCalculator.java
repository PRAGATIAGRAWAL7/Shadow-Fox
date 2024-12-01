import java.util.Scanner;

public class AdvancedCalculator {

    // Method for basic arithmetic operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;  // Return NaN for invalid division
        }
        return a / b;
    }

    // Method for scientific operations
    public static double log(double a) {
        if (a <= 0) {
            System.out.println("Error! Logarithm undefined for values <= 0.");
            return Double.NaN;
        }
        return Math.log(a);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double sine(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees); // Convert to radians
        return Math.sin(angleInRadians);
    }

    public static double cosine(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees); // Convert to radians
        return Math.cos(angleInRadians);
    }

    public static double tangent(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees); // Convert to radians
        return Math.tan(angleInRadians);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        System.out.println("Welcome to the Advanced Calculator!");

        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Logarithm");
            System.out.println("6. Exponentiation (Power)");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = log(num1);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;

                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = power(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    result = sine(num1);
                    System.out.println("Result: " + result);
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    result = cosine(num1);
                    System.out.println("Result: " + result);
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    result = tangent(num1);
                    System.out.println("Result: " + result);
                    break;

                case 0:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
