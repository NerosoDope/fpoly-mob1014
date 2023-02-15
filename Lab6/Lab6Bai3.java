import java.util.ArrayList;

public class Lab6Bai3 {
    public void Bai3() {
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i = 0;i<5;i++){
            SinhVien sv = new SinhVien(null, null, null, null);
            sv.nhap();
            list.add(sv);
        }

        for (SinhVien sv : list){
            sv.xuat();
        }
    }
}
