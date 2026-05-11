import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = -1;
        int year = -1;

        while (true) {
            // 1. Nhập tháng
            System.out.print("Enter month (Full name, abbreviation, 3 letters, or number): ");
            String monthInput = scanner.nextLine().trim();
            month = getMonthNumber(monthInput);

            // 2. Nhập năm
            System.out.print("Enter year (non-negative number with all digits): ");
            String yearInput = scanner.nextLine().trim();
            
            try {
                year = Integer.parseInt(yearInput);
            } catch (NumberFormatException e) {
                year = -1; // Đánh dấu năm không hợp lệ
            }

            // 3. Kiểm tra tính hợp lệ và hiển thị kết quả
            if (month != -1 && year >= 0) {
                int days = getDaysInMonth(month, year);
                System.out.println("Result: The month " + monthInput + " in year " + year + " has " + days + " days.");
                break; // Thoát vòng lặp khi dữ liệu hợp lệ
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }
        scanner.close();
    }

    // Hàm chuyển đổi các kiểu nhập tháng về số (1-12)
    public static int getMonthNumber(String input) {
        input = input.toLowerCase();
        
        // Kiểm tra nếu là số
        if (input.equals("1") || input.equals("january") || input.equals("jan.") || input.equals("jan")) return 1;
        if (input.equals("2") || input.equals("february") || input.equals("feb.") || input.equals("feb")) return 2;
        if (input.equals("3") || input.equals("march") || input.equals("mar.") || input.equals("mar")) return 3;
        if (input.equals("4") || input.equals("april") || input.equals("apr.") || input.equals("apr")) return 4;
        if (input.equals("5") || input.equals("may")) return 5;
        if (input.equals("6") || input.equals("june") || input.equals("jun")) return 6;
        if (input.equals("7") || input.equals("july") || input.equals("jul")) return 7;
        if (input.equals("8") || input.equals("august") || input.equals("aug.") || input.equals("aug")) return 8;
        if (input.equals("9") || input.equals("september") || input.equals("sept.") || input.equals("sep")) return 9;
        if (input.equals("10") || input.equals("october") || input.equals("oct.") || input.equals("oct")) return 10;
        if (input.equals("11") || input.equals("november") || input.equals("nov.") || input.equals("nov")) return 11;
        if (input.equals("12") || input.equals("december") || input.equals("dec.") || input.equals("dec")) return 12;
        
        return -1; // Không hợp lệ
    }

    // Hàm tính số ngày dựa trên tháng và năm (có xét năm nhuận)
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Logic năm nhuận: chia hết cho 4, không chia hết cho 100 HOẶC chia hết cho 400
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}