import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = sc7.nextLine();
            System.out.print("Masukkan baris : ");
            baris = sc7.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc7.nextInt();
            sc7.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc7.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    sc7.close();
    }
}
