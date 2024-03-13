package decision_making;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tu 1 den 9");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("So mot");
                break;
            case 2:
                System.out.println("So hai");
                break;
            case 3:
                System.out.println("So ba");
                break;
            case 4:
                System.out.println("So bon");
                break;
            case 5:
                System.out.println("So nam");
                break;
            case 6:
                System.out.println("So sau");
                break;
            case  7:
                System.out.println("So bay");
            case 8:
                System.out.println("So tam");
            case 9:
                System.out.println("So chin");
            default:
                System.out.println("So ban nhap k hop le");
        }
    }
}
