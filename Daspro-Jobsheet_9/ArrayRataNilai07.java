import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlahLulus = 0; 
        System.out.println("Masukkan jumlah mahsiswa : ");
        int jmlMhs = sc7.nextInt();
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");
            nilaiMhs[i] = sc7.nextInt();

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        sc7.close();
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
    }
}
