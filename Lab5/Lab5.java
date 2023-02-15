import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Lab5Bai1 b1 = new Lab5Bai1();
        Lab5Bai2 b2 = new Lab5Bai2();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Tinh tong cac so thuc");
            System.out.println("2. Danh sach ho ten");
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
                case 0:
                    break;
                default:
                    System.out.println("Ban chua chon dung chuc nang. Vui long chon lai.");
            }
        } while (choose != 0);
    }
}