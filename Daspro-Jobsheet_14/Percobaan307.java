import java.util.Scanner;
public class Percobaan307 {

    public static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main (String[] args){
        Scanner sc7 = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc7.nextInt ();
        System.out.print("Lamanya investasi (tahun) :");
        tahun = sc7.nextInt();

//Mamanggil Fungsi hitungLaba
        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));

        sc7.close();
    }
}