import java.util.Scanner;
import java.lang.Math;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh cua khoi lap phuong: ");
        float canh = sc.nextFloat();
        
        double theTich = Math.pow(canh, 3);
        System.out.printf("The tich khoi lap phuong la: %.2f", theTich);
    }
}
