import java.util.Scanner;

public class LinearSearch07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

        // Meminta jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc7.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        // Meminta elemen-elemen array
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan Elemen ke-" + (i) + ": ");
            arrayInt[i] = sc7.nextInt();
        }

        // Meminta nilai kunci yang ingin dicari
        System.out.print("Masukkan nilai key yang ingin dicari: ");
        int key = sc7.nextInt();
        int hasil = -1; // Inisialisasi hasil pencarian

        // Melakukan pencarian linear
        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan.");
        }

        sc7.close();
    }
}
