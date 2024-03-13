package decision_making;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu 1");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so nguyen thu 2");
        int number2 = scanner.nextInt();
        System.out.println("Vui long nhap phep tinh ban mong muon(+, -, *, / ): ");
        char operator = scanner.next().charAt(0);
        String format = "ket qua phep tinh ban vua nhap la: %d";
        switch (operator){
            case '+':
                System.out.println(String.format(format, number1 + number2));
                break;
            case '-':
                System.out.println(String.format(format, number1 - number2));
                break;
            case '*':
                System.out.println(String.format(format, number1 * number2));
                break;
            case '/':
                System.out.println(String.format(format, number1 / number2));
                break;
            default:
                System.out.println("phep tinh ban nhap k hop le");
        }


    }
}
