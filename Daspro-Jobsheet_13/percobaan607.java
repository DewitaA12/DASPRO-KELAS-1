import java.util.Scanner;
public class percobaan607 {
    //Fungsi Hitung Luas
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    //Fungsi Hitung Volume
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas (a,b)*tinggi;
        return volume;
    }
    //Fungsi main
    public static void main(String[] args) {
        Scanner inp07 = new Scanner (System.in);
        int p, l, t, L, vol;
        System.out.println("Masukkan panjang");
        p = inp07.nextInt();
        System.out.println("Masukkan lebar");
        l = inp07.nextInt();
        System.out.println("Masukkan tinggi");
        t=inp07.nextInt();

        L=hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah " + L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume Balok adalah " + vol);
    inp07.close();
    }

    }

