import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void KiemTraSNT() {
        int number;
        boolean ok = true;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Kiem tra so nguyen to");
        System.out.print("Nhap vao 1 so bat ki: ");
        number = sc.nextInt();

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                ok = false;
                break;
            }
            i++;
        }

        if (ok == true) {
            System.out.printf("%d la so nguyen to\n", number);
        } else {
            System.out.printf("%d khong phai la so nguyen to\n", number);
        }
    }

    public static void BangCuuChuong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bang cuu chuong can tinh: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", x, i, x * i);
        }
        MenuBCC();
    }

    public static void TatCaBangCuuChuong() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
        MenuBCC();
    }

    public static void MenuBCC() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---- CHUONG TRINH TINH BANG CUU CHUONG ----");
        System.out.println("1. Bang cuu chuong");
        System.out.println("2. Tat ca bang cuu chuong");
        System.out.println("3. Tro ve menu");
        System.out.print("Moi ban chon chuc nang: ");
        int chooseMenuBCC = sc.nextInt();
        do {
            switch (chooseMenuBCC) {
                case 1:
                    BangCuuChuong();
                    break;
                case 2:
                    TatCaBangCuuChuong();
                    break;
                case 3:
                    main(null);
                    break;
                default:
                    System.out.println("Chuc nang khong hop le.");
                    MenuBCC();
                    break;
            }
        } while (chooseMenuBCC != 3);
    }

    public static void MangSoNguyen() {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        n = sc.nextInt();

        int mang[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            mang[i] = sc.nextInt();
        }

        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.printf("Gia tri phan tu thu %d: %d\n", (i + 1), mang[i]);
        }

        System.out.println();
        System.out.println("Gia tri phan tu trong mang sau khi sap xep\n");
        Arrays.sort(mang);

        for (i = 0; i < n; i++) {
            System.out.printf("Gia tri phan tu thu %d: %d\n", (i + 1), mang[i]);
        }

        int min = mang[0];
        for (i = 1; i < mang.length; i++) {
            min = Math.min(min, mang[i]);
        }

        System.out.println();
        System.out.printf("Phan tu nho nhat: %d\n", min);

        float sum = 0;
        float count = 0;

        for (i = 0; i < n; i++) {
            if (mang[i] % 3 == 0) {
                sum += mang[i];
                count++;
            }
        }

        float avg = sum / count;
        System.out.printf("Trung binh cong cac so chia het cho 3: %.2f\n", avg);
    }

    public static void sort(String hoTen[], float diem[]) {
        int i, j;
        for (i = 0; i < hoTen.length - 1; i++) {
            for (j = 0; j < hoTen.length - 1; j++) {
                if (diem[i] > diem[j]) {
                    float temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;

                    String tempName = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempName;
                }
            }
        }
    }

    public static void Bai4() {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hoc sinh: ");
        n = sc.nextInt();

        String hoTen[] = new String[50];
        float diem[] = new float[50];

        for (i = 0; i < n; i++) {
            hoTen[i] = sc.nextLine();
            System.out.printf("Nhap ho va ten sinh vien thu %d: ", i + 1);
            hoTen[i] = sc.nextLine();
            System.out.printf("Nhap diem sinh vien nhu %d: ", i + 1);
            diem[i] = sc.nextFloat();
        }

        sort(hoTen, diem);

        for (i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Ho va ten: ");
            System.out.println(hoTen[i]);
            System.out.printf("Diem trung binh: ");
            System.out.println(diem[i]);

            if (diem[i] >= 9) {
                System.out.println("Hoc luc: Xuat sac");
            } else if (diem[i] >= 7.5) {
                System.out.println("Hoc luc: Gioi");
            } else if (diem[i] >= 6.5) {
                System.out.println("Hoc luc: Kha");
            } else if (diem[i] >= 5) {
                System.out.println("Hoc luc: Trung binh");
            } else {
                System.out.println("Hoc luc: Yeu");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println();
            System.out.println("---- MENU ----");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Bang cuu chuong");
            System.out.println("3. Nhap mang so nguyen");
            System.out.println("4. Ho ten va diem cua sinh vien");
            System.out.println("5. Thoat");
            System.out.print("Moi ban chon chuc nang: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    KiemTraSNT();
                    break;
                case 2:
                    MenuBCC();
                    break;
                case 3:
                    MangSoNguyen();
                    break;
                case 4:
                    Bai4();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ban chua chon dung chuc nang. Vui long chon lai.");
            }
        } while (choose != 5);
    }
}