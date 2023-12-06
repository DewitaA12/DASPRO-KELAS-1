import java.util.Scanner;
public class MarmutFibonacci07 {

    static int hitungmarmut(int bulan) {
        if ( bulan == 1 ) {
            return 0;
        } else if (bulan == 2) {
            return 1;
        } else {
            return hitungmarmut(bulan - 1) + hitungmarmut(bulan - 2);
    }
}

    public static void main(String[] args) {
        Scanner sc7 = new Scanner (System.in);
        System.out.print(" Masukkan bulan : ");
        int bulan = sc7.nextInt();
        int produktif = hitungmarmut(bulan);
        int belumProduktif = hitungmarmut(bulan-1);

        System.out.println(" Bulan ke-" + bulan + ":");
        System.out.println(" Jumlah Pasangan produktif: " +produktif);
        System.out.println(" Jumlah Pasangan belum produktif: " + belumProduktif);
        System.out.println(" Total Pasangan: " +( produktif +belumProduktif));
        sc7.close();
    }
}