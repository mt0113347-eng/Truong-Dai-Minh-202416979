import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Solving the equation: ax + b = 0");
        
        try {
            // Input for coefficient a
            System.out.print("Enter value for a: ");
            double a = scanner.nextDouble();
            
            // Input for coefficient b
            System.out.print("Enter value for b: ");
            double b = scanner.nextDouble();

            // Logic handling
            if (a == 0) {
                if (b == 0) {
                    System.out.println("The equation has infinitely many solutions (0 = 0).");
                } else {
                    System.out.println("The equation has no solution (" + b + " = 0 is impossible).");
                }
            } else {
                // Calculation: x = -b / a
                double x = -b / a;
                System.out.println("The solution is x = " + x);
            }
            
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values (e.g., 5 or 2.5).");
        } finally {
            scanner.close();
        }
    }
}