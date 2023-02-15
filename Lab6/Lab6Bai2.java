import java.util.ArrayList;

public class Lab6Bai2 {
    public void Bai2() {
        ArrayList<SanPham> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        for(SanPham sp : list){
            if(sp.getHang().equalsIgnoreCase("Nokia")){
                System.out.println();
                sp.xuat();   
            }
        }
    }
}
