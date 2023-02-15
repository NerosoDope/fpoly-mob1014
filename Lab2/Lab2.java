import java.util.Scanner;
import java.lang.Math;

public class Lab2 {
    public static void giaiPT1(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();

        System.out.printf("Ta co phuong trinh: %dx + %d = 0\n",a,b);
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            int x=-b/a;
            System.out.println("Phuong trinh co 1 nghiem duy nhat: "+x);
        }
    }

    public static void giaiPT2(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
        System.out.print("Nhap so c: ");
        c = sc.nextInt();

        System.out.printf("Ta co phuong trinh: %dx² + %dx + %d = 0\n",a,b,c);
        double delta = Math.pow(b,2)-4*a*c;

        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
        } else if(delta==0){
            System.out.println("Phuong trinh co nghiem kep");
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet");

            double n1=(-b+Math.sqrt(delta))/(2*a);
            double n2=(-b-Math.sqrt(delta))/(2*a);

            System.out.printf("x1 = %.2f\n",n1);
            System.out.printf("x2 = %.2f\n",n2);
        }
    }

    public static void tinhTienDien(){
        double tien,soDien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien tieu thu: ");
        soDien = sc.nextDouble();
        
        if(soDien<=50){
            tien = soDien*1000;
        } else {
            tien = 50*1000 + (soDien-50)*1200;
        }
        System.out.println("So tien phai tra: "+tien);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- MENU ----");
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        int choose;
        do {
        System.out.print("Moi ban chon chuc nang: ");
        choose = sc.nextInt();
        switch(choose){
            case 1:
                System.out.println("Giai phuong trinh bac 1");
                giaiPT1();
                break;
            case 2:
                System.out.println("Giai phuong trinh bac 2");
                giaiPT2();
                break;
            case 3:
                System.out.println("Tinh tien dien");
                tinhTienDien();
                break;
            case 4:
                break;
            default:
                System.out.println("Ban chua chon dung chuc nang. Vui long chon lai");
        }
    } while(choose!=4);

}
}