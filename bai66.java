import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // 2. Nhập dữ liệu cho ma trận thứ nhất
        System.out.println("Nhập các phần tử cho ma trận thứ nhất:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Ma trận 1 [%d][%d]: ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // 3. Nhập dữ liệu cho ma trận thứ hai
        System.out.println("Nhập các phần tử cho ma trận thứ hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Ma trận 2 [%d][%d]: ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // 4. Thực hiện phép cộng hai ma trận
        // Công thức: C[i][j] = A[i][j] + B[i][j]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // 5. Hiển thị kết quả
        System.out.println("\nKết quả cộng hai ma trận là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }

        scanner.close();
    }
}