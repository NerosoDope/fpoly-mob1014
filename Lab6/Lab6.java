import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Lab6Bai1 b1 = new Lab6Bai1();
        Lab6Bai2 b2 = new Lab6Bai2();
        Lab6Bai3 b3 = new Lab6Bai3();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Kiem tra ho va ten");
            System.out.println("2. Danh sach san pham");
            System.out.println("3. Danh sach thong tin sinh vien");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon chuc nang: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    b1.Bai1();
                    break;
                case 2:
                    b2.Bai2();
                    break;
                case 3:
                    b3.Bai3();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ban chua chon dung chuc nang. Vui long chon lai.");
            }
        } while (choose != 0);
    }
}
