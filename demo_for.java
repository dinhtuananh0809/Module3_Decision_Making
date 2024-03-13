package decision_making;

public class demo_for {
    public static void main(String[] args) {
        String format = "5 * %d = %d";
        for (int i = 1; i <= 10; i++) {
            // Thêm giá trị của phép nhân 5 * i
            System.out.println(String.format(format, i, 5 * i));
        }
    }
}
