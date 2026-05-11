import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình: ax^2 + bx + c = 0");

        try {
            System.out.print("Nhập a: ");
            double a = sc.nextDouble();
            System.out.print("Nhập b: ");
            double b = sc.nextDouble();
            System.out.print("Nhập c: ");
            double c = sc.nextDouble();

            // Trường hợp a = 0: Trở thành phương trình bậc nhất bx + c = 0
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) System.out.println("Phương trình vô số nghiệm.");
                    else System.out.println("Phương trình vô nghiệm.");
                } else {
                    System.out.println("Do a=0, nghiệm là x = " + (-c / b));
                }
            } else {
                // Tính Delta theo Hint trong ảnh
                double delta = b * b - 4 * a * c;
                System.out.println("Delta = " + delta);

                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.2f, x2 = %.2f\n", x1, x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", x);
                } else {
                    System.out.println("Phương trình vô nghiệm thực.");
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số thực.");
        } finally {
            sc.close();
        }
    }
}