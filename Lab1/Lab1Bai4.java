import java.util.Scanner;
import java.lang.Math;

public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap he so b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap he so c: ");
        float c = sc.nextFloat();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);

        System.out.printf("Delta = %.2f\n", delta);
        System.err.printf("Can delta = %.2f", canDelta);
    }
}
