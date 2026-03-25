import java.util.Scanner;

public class TriangleDrawer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ cao n: ");
        int n = scanner.nextInt();

        // Vòng lặp chạy qua từng dòng từ 1 đến n
        for (int i = 1; i <= n; i++) {
            
            // 1. In khoảng trắng để căn giữa tam giác
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. In các dấu sao (*)
            // Số lượng dấu sao là 2*i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }

        scanner.close();
    }
}