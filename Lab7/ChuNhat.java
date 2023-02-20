public class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.printf("Chu vi hinh chu nhat: %.2f\n",getChuVi());
        System.out.printf("Dien tich hinh chu nhat: %.2f\n",getDienTich());
    }
}