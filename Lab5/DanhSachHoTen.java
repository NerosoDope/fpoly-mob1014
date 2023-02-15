import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
    private ArrayList<String> list2 = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap ho va ten: ");
            String s = sc.nextLine();
            if (s.isEmpty()) {
                System.out.println("Nhap du lieu thanh cong");
                break;
            }
            list2.add(s);
        }
    }

    public void xuat() {
        System.out.println();
        for (String item : list2) {
            System.out.printf("%s\n", item);
        }
    }

    public void ngaunhien() {
        System.out.println();
        Collections.shuffle(list2);
        xuat();
    }

    public void sapxep() {
        System.out.println();
        Collections.sort(list2);
        Collections.reverse(list2);
        xuat();
    }

    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten muon xoa: ");
        String s = sc.nextLine();
        for (String item : list2) {
            if (item.equals(s)) {
                list2.remove(item);
                System.out.println("Xoa ho ten thanh cong");
                break;
            }
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Xoa ho ten");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon chuc nang: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngaunhien();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    xoa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ban chua chon dung chuc nang. Vui long chon lai.");
                    break;
            }
        } while (choose != 0);
    }
}