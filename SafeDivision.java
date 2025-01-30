import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 / num2;
            
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (ArithmeticException e) {
l            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            System.out.println("Execution completed.");
            scanner.close(); 
        }
    }
}
