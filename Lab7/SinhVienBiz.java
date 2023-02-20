public class SinhVienBiz extends SinhVienPoly {
    protected double marketting;
    protected double sales;

    public SinhVienBiz(String hoTen, String nganh, double marketting, double sales) {
        super(hoTen, nganh);
        this.marketting = marketting;
        this.sales = sales;
    }

    @Override
    double getDiem() {
        return (2 * marketting + sales) / 3;
    }

}