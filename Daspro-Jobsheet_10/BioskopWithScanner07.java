import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc7.nextInt();
            sc7.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    nama = sc7.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc7.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc7.nextInt();
                    sc7.nextLine();

                    if (isValid(baris, kolom, penonton)) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton telah disimpan.");
                    } else {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;

                case 3:
                    sc7.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
                }
            }
        }
    // Fungsi untuk memeriksa validitas nomor baris dan kolom
    static boolean isValid(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length;
    }
}
