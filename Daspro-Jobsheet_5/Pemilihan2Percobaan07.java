import java.util.Scanner;
public class Pemilihan2Percobaan07{
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Nilai uas    :");
        float uas = input07.nextFloat();
        System.out.print("Nilai uts    :");
        float uts = input07.nextFloat();
        System.out.print("Nilai kuis   :");
        float kuis = input07.nextFloat();
        System.out.print("Nilai tugas  :");
        float tugas = input07.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String message;
        String nilaihuruf;
        String nilaisetara;
        if (total > 80 && total <= 100) {
            nilaihuruf = "A";
            nilaisetara = "4";
            message = "Sangat Baik";
    } else if (total > 73 && total <= 80) {
            nilaihuruf = "B+";
            nilaisetara = "3,5";
            message = "Lebih dari Baik";
    } else if (total > 65 && total <= 73) {
            nilaihuruf = "B";
            nilaisetara = "3";
            message = "Baik";
    }else if (total > 60 && total <= 65) {
            nilaihuruf = "C+";
            nilaisetara = "2,5";
            message = "Lebih dari Cukup";
    }else if (total > 50 && total <= 60) {
            nilaihuruf = "C";
            nilaisetara = "2";
            message = "Cukup";
    }else if (total > 39 && total <= 50) {
            nilaihuruf = "D";
            nilaisetara = "1";
            message = "Kurang";
    }else if (total > 0 && total <= 39) {
            nilaihuruf = "E";
            nilaisetara = "0";
            message = "Gagal";
    }else {
        nilaihuruf = "Tidak Valid";
        nilaisetara = "Tidak valid";
        message = "Nilai di luar rentang valid";
    }
    input07.close();
System.out.println("Nilai akhir = " + total + " sehingga nilai huruf = " + nilaihuruf + ", kualifikasi = " + message + ", Konversi = " + nilaisetara);
}
}