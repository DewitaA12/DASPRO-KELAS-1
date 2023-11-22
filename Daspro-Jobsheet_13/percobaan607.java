import java.util.Scanner;
public class percobaan607 {
    public static void main(String[] args){
        Scanner inp07 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = inp07.nextInt();
        System.out.println("Masukkan lebar");
        l = inp07.nextInt();
        System.out.println("Masukkan tinggi");
        t = inp07.nextInt();

        L = p*l;
        System.out.println("Luas Persegi panjang adalah " + L);

        vol = p*l*t;
        System.out.println("Volume balok adalah " + vol);
        inp07.close();
    }

}