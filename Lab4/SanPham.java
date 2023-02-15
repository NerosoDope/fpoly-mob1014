import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println();
        System.out.printf("Ten san pham: %s\n", tenSP);
        System.out.printf("Don gia: %.2f\n", donGia);
        System.out.printf("Giam gia: %.2f\n", giamGia);
        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
        System.out.println();
    }
}
