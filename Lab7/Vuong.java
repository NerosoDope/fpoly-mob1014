public class Vuong extends ChuNhat{

    public Vuong(double canh) {
        super(canh, canh);
        double rong = canh; 
    }

    public void xuat(){
        System.out.printf("Chu vi hinh vuong la: %.2f\n",getChuVi());
        System.out.printf("Dien tich hinh vuong la: %.2f\n",getDienTich());
    }

}