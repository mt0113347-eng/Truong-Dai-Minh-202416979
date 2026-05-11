import javax.swing.JOptionPane;
 
public class CalculatorDouble {
    public static void main(String[] args) {
 
        // Nhập dữ liệu dạng String
        String strNum1 = JOptionPane.showInputDialog("Enter first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter second number:");
 
        // Chuyển sang double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
 
        // Tính toán
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
 
        String result = "";
        result += "Sum = " + sum + "\n";
        result += "Difference = " + diff + "\n";
        result += "Product = " + product + "\n";
 
        // Kiểm tra chia cho 0
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Quotient = " + quotient;
        } else {
            result += "Cannot divide by 0!";
        }
 
        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, result);
    }
}
