import java.util.ArrayList;
import java.util.Scanner;

public class MangSoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap so thuc: ");
            Double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println();
        for (double item : list) {
            System.out.printf("%.1f ",item);
        }
    }

    public void sum(){
        double sum = 0;
        System.out.println();
        for (Double item : list) {
           sum += item;
        }
        System.out.println("Tong cac so thuc = "+sum);
    }
}