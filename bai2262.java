import java.util.Scanner;

public class LinearSystemSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Giải hệ phương trình bậc nhất 2 ẩn:");
            System.out.print("Nhập a11, a12, b1: ");
            double a11 = sc.nextDouble();
            double a12 = sc.nextDouble();
            double b1 = sc.nextDouble();

            System.out.print("Nhập a21, a22, b2: ");
            double a21 = sc.nextDouble();
            double a22 = sc.nextDouble();
            double b2 = sc.nextDouble();

            // Tính các định thức (Determinants) theo Hint trong ảnh
            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            // Biện luận nghiệm
            if (D != 0) {
                double x1 = D1 / D;
                double x2 = D2 / D;
                System.out.printf("Hệ có nghiệm duy nhất: x1 = %.2f, x2 = %.2f\n", x1, x2);
            } else {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("Hệ phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Hệ phương trình vô nghiệm.");
                }
            }

        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập đúng định dạng số.");
        } finally {
            sc.close();
        }
    }
}