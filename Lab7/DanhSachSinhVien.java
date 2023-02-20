import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Nhap ho va ten: ");
            String hoTen = sc.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                break;
            }
            System.out.print("Nhap ten nganh (IT/BIZ): ");
            String nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Nhap diem Java: ");
                double java = sc.nextDouble();
                System.out.print("Nhap diem CSS: ");
                double css = sc.nextDouble();
                System.out.print("Nhap diem HTML: ");
                double html = sc.nextDouble();
                SinhVienPoly svfpl1 = new SinhVienIT(hoTen, nganh, java, css, html);
                list.add(svfpl1);
            } else if (nganh.equalsIgnoreCase("BIZ")) {
                System.out.print("Nhap diem Marketing: ");
                double marketting = sc.nextDouble();
                System.out.print("Nhap diem Sales: ");
                double sales = sc.nextDouble();
                SinhVienPoly svfpl1 = new SinhVienBiz(hoTen, nganh, marketting, sales);
                list.add(svfpl1);
            }
        } while (true);
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.println();
            System.out.printf("Ho va ten: %s\n", sv.getHoTen());
            System.out.printf("Nganh: %s\n", sv.getNganh());
            System.out.printf("Diem: %.2f\n", sv.getDiem());
            System.out.printf("Hoc luc: %s\n", sv.getHocLuc());
        }
    }

    public void gioi() {
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
                System.out.println();
                System.out.printf("Ho va ten: %s\n", sv.getHoTen());
                System.out.printf("Nganh: %s\n", sv.getNganh());
                System.out.printf("Diem: %.2f\n", sv.getDiem());
                System.out.printf("Hoc luc: %s\n", sv.getHocLuc());
            }
        }
    }

    Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly o1, SinhVienPoly o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };

    public void sort() {
        Collections.sort(list, comp);
        xuat();
    }

    public void menu() {
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach thong tin sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
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
                    gioi();
                    break;
                case 4:
                    sort();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ban chua chon dung chuc nang. Vui long chon lai.");
            }

        } while (choose != 0);
    }
}