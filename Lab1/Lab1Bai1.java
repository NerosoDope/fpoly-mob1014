import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        float diemTB = sc.nextFloat();
        
        System.out.printf("%s\n", hoTen);
        System.out.printf("Diem trung binh: %.2f\n", diemTB);
    }
}