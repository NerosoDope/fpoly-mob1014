public class SinhVienIT extends SinhVienPoly {
    protected double java;
    protected double css;
    protected double html;

    public SinhVienIT(String hoTen, String nganh, double java, double css, double html) {
        super(hoTen, nganh);
        this.java = java;
        this.css = css;
        this.html = html;
    }

    @Override
    double getDiem() {
        return (2 * java + java + html) / 4;
    }
    
}
