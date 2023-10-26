import java.util.Scanner;
public class Pemilihan2Percobaan307{
    public static void main(String[] args) {
        Scanner inp07 = new Scanner(System.in);
        String kategori;
        int income, gajibersih;
        double pajak = 0;
        System.out.println("Masukkan Kategori :");
        kategori = inp07.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan :");
        income = inp07.nextInt();
        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (income <= 2000000)
            pajak = 0.1;
            else if (income <= 3000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajibersih = (int) (income - (pajak * income));
            System.out.println("Penghasilan Bersih : " + gajibersih);
        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (income <= 2500000)
            pajak = 0.15;
            else if (income <= 3500000)
            pajak = 0.2;
            else
            pajak = 0.25;
            gajibersih = (int) (income - (pajak*income));
            System.out.println("Penghasilan Bersih :" + gajibersih);
        }else
        System.out.println("Masukan Kategori Salah");
        inp07.close();
    }
}