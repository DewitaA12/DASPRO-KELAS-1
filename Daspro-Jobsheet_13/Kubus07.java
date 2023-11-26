import java.util.Scanner;

public class Kubus07 {
    static int sisi;

    public static int volume() {
        int vol = sisi * sisi * sisi;
        System.out.println("Jadi Volume Kubus = " + vol + "m^3");
        return vol;
    }

    public static int luaspermukaan() {
        int lp = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan Kubus = " + lp + "m^2");
        return lp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang (m) sisi kubus = ");
        sisi = sc.nextInt();
        
        volume();
        luaspermukaan();

        sc.close();
    }
}

