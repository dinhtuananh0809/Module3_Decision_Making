package decision_making;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Excrcise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu 1");
        int number1 = scanner.nextInt();
        System.out.println("Nhap vao so nguyen thu 2");
        int number2 = scanner.nextInt();
        if (number1 > number2){
            System.out.println("vui long nhap lai, so thu 1 phai nho hon so thu 2 ");
            System.out.println("Nhap vao so nguyen thu 1");
            number1 = scanner.nextInt();
            System.out.println("Nhap vao so nguyen thu 2");
            number2 = scanner.nextInt();
        }
        int result = 0;
        int i ;
        for (i = number1; i<= number2; i++){
            if (i % 2 == 0){
                result += i;
            }
        }
        System.out.printf("Tong cac so tu %d va %d la: %d", number1,number2,result);

    }
}
