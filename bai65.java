import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] my_array1 = new int[n];

        // 2. Nhập các giá trị cho mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử [" + i + "]: ");
            my_array1[i] = scanner.nextInt();
        }

        // 3. Tính tổng các phần tử
        int sum = 0;
        for (int value : my_array1) {
            sum += value;
        }

        // 4. Tính giá trị trung bình
        double average = (double) sum / n;

        // 5. Sắp xếp mảng
        System.out.println("\nMảng ban đầu: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);

        // 6. Hiển thị kết quả
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(my_array1));
        System.out.println("Tổng các phần tử: " + sum);
        System.out.printf("Giá trị trung bình: %.2f\n", average);

        scanner.close();
    }
}