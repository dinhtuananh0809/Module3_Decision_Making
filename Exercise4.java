import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem mon toan");
        float math = scanner.nextFloat();
        System.out.println("Nhap diem mon vat ly");
        float physics = scanner.nextFloat();
        System.out.println("Nhap diem mon hoa");
        float chemical = scanner.nextFloat();
        System.out.println("Nhap diem mon van");
        float literature = scanner.nextFloat();
        System.out.println("Nhap diem mon tieng anh");
        float english = scanner.nextFloat();
        float average = (math + physics + chemical + literature + english) / 5;
        if (average >= 0 && average < 5) {
            System.out.printf("Xep loai yeu: %.2f", average);
        } else if (average >= 5 && average < 6.5) {
            System.out.printf("Xep loai trung binh: %.2f", average);
        } else if (average >= 6.5 && average < 8) {
            System.out.printf("Xep loai kha: %.2f", average);
        } else if (average >= 8 && average < 9) {
            System.out.printf("Xep loai gioi: %.2f", average);
        } else if (average >= 9 && average <= 10) {
            System.out.printf("Xep loai xuat sac: %.2f", average);
        } else {
            System.out.println("Hay nhap so diem thap hon 10");
        }

    }
}
