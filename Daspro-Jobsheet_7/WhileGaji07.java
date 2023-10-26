import java.util.Scanner;
public class WhileGaji07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;
        String jabatan;
        gajiLembur = 0;
        totalGajiLembur = 0;
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();
        int i = 0;
        while (i < jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ":");
            jabatan = sc.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("Manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }else {
                System.out.println("Jabatan Invalid");
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
        sc.close();
    }
}