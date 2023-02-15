import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String email;
    private String phone;
    private String cmnd;

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public SinhVien(String hoTen, String email, String phone, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.phone = phone;
        this.cmnd = cmnd;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.print("Nhap ho va ten: ");
            hoTen = sc.nextLine();
            if (hoTen.equals("")) {
                System.out.println("Ho va ten khong hop le.");
            } else
                break;
        } while (true);

        Pattern pattern = new Pattern();
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (pattern.Email(email)) {
                break;
            }
            System.out.println("Email khong hop le.");
        } while (true);

        do {
            System.out.print("Nhap so dien thoai: ");
            phone = sc.nextLine();
            if (pattern.Phone(phone)) {
                break;
            }
            System.out.println("So dien thoai khong hop le.");
        } while (true);

        do {
            System.out.print("Nhap cmnd: ");
            cmnd = sc.nextLine();
            if (pattern.CMND(cmnd)) {
                break;
            }
            System.out.println("CMND khong hop le.");
        } while (true);
    }

    public void xuat(){
        System.out.println();
        System.out.printf("Ho va ten: %s\n",hoTen);
        System.out.printf("Email: %s\n",email);
        System.out.printf("So dien thoai: %s\n",phone);
        System.out.printf("CMND: %s\n",cmnd);
    }
}