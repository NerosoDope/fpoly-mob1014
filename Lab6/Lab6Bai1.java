import java.util.Scanner;

public class Lab6Bai1 {
    public void Bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        
        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" "),hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "));

        System.out.printf("%s %s %s",ho.toUpperCase(),tenDem,ten.toUpperCase());
        System.out.println();
    }
}