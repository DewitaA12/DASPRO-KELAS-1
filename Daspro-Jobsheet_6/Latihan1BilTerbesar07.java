import java.util.Scanner;

public class Latihan1BilTerbesar07 {
    public static void main(String[] args) {
        Scanner inp07 = new Scanner(System.in);
        int a, b, c, terbesar;

        System.out.print("Masukkan nilai a = ");
        a = inp07.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = inp07.nextInt();
        System.out.print("Masukkan nilai c = ");
        c = inp07.nextInt();

        // Inisialisasi terbesar dengan nilai a
        terbesar = a;

        // Membandingkan nilai b dan c dengan terbesar
        terbesar = (b > terbesar) ? b : terbesar;
        terbesar = (c > terbesar) ? c : terbesar;

        System.out.println("Bilangan terbesar: " + terbesar);

        inp07.close();
    }
}
