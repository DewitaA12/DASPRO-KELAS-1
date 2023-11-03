import java.util.Scanner;

public class Rata8bilangan07 {
    public static void main(String[] args) {
        Scanner inp07 = new Scanner(System.in);
        int[] bilangan = new int[8];

        // Mengisi array dengan bilangan bulat
        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan bilangan bulat ke-" + (i + 1) + ": ");
            bilangan [i] = inp07.nextInt();
        }

        // Menghitung rata-rata
        int jumlah = 0;
        for (int i = 0; i < 8; i++) {
            jumlah += bilangan[i];
        }
        double rata2 = (double) jumlah / 8;

        // Menampilkan hasil
        System.out.print("bilangan : ");
        for (int i = 0; i < 8; i++) {
            System.out.print(bilangan[i] + " ");
        }
        inp07.close();
        System.out.println("\nRata-rata: " + rata2);
    }
}
