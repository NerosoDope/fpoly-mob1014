import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat cua hinh chu nhat: ");
        float canh1 = sc.nextFloat();
        System.out.print("Nhap canh thu hai cua hinh chu nhat: ");
        float canh2 = sc.nextFloat();

        float chuVi = (canh1 + canh2) * 2;
        float dienTich = canh1 * canh2;
        float canhNhoNhat = Math.min(canh1, canh2);
        
        System.out.printf("Chu vi hinh chu nhat la: %.2f\n", chuVi);
        System.out.printf("Dien tich hinh chu nhat la: %.2f\n", dienTich);
        System.out.printf("Canh nho nhat cua hinh chu nhat la: %.2f\n", canhNhoNhat);
    }
}
