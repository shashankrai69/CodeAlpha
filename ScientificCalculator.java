import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Logarithm (base 10)");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num4 = scanner.nextDouble();
                    result = num3 - num4;
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double num5 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num6 = scanner.nextDouble();
                    result = num5 * num6;
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    double dividend = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    double divisor = scanner.nextDouble();
                    if (divisor != 0) {
                        result = dividend / divisor;
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    double num7 = scanner.nextDouble();
                    if (num7 >= 0) {
                        result = Math.sqrt(num7);
                    } else {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    }
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    double num8 = scanner.nextDouble();
                    if (num8 > 0) {
                        result = Math.log10(num8);
                    } else {
                        System.out.println("Error: Cannot calculate logarithm of a non-positive number.");
                    }
                    break;
                case 7:
                    System.out.print("Enter an angle in radians: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(angle);
                    break;
                case 8:
                    System.out.print("Enter an angle in radians: ");
                    double angle2 = scanner.nextDouble();
                    result = Math.cos(angle2);
                    break;
                case 9:
                    System.out.print("Enter an angle in radians: ");
                    double angle3 = scanner.nextDouble();
                    result = Math.tan(angle3);
                    break;
                case 0:
                    System.out.println("Exiting Scientific Calculator.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Result: " + result);
            System.out.println();
        }
    }
}
