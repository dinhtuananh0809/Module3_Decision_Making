package decision_making;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap 1 so");
        int number = scanner.nextInt();
        while (number < 0 || number > 999){
            System.out.println("So nhap khong hop le, hay nhap 1 so khac");
            number = scanner.nextInt();
        }
        String convert  = String.valueOf(number);
        String output;
    }
}
