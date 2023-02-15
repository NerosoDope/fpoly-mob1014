import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public String getTenSp() {
        return this.tenSP;
    }

    public void setTenSp(String tenSp) {
        this.tenSP = tenSp;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return this.hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhap san pham: ");
            tenSP = sc.nextLine();
            System.out.print("Nhap don gia: ");
            donGia = sc.nextDouble();
            System.out.print("Nhap hang: ");
            hang = new Scanner(System.in).nextLine();
    }

    public void xuat(){
        System.out.printf("Ten san pham: %s\n",tenSP);
        System.out.printf("Don gia: %.2f\n",donGia);
        System.out.printf("Hang: %s\n",hang);
    }
}
