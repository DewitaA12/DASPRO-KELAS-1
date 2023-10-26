import java.util.Scanner;
public class Latihan1BilTerbesar07 {
    public static void main(String[] args) {
        Scanner inp07 = new Scanner(System.in);
        int a, b, c, terbesar;
        System.out.println("Masukkan nilai a =");
        a = inp07.nextInt();
        System.out.println("Masukkan nilai b =");
        b = inp07.nextInt();
        System.out.println("Masukkan nilai c =");
        c = inp07.nextInt();
        terbesar = (b > terbesar) ? b : terbesar;
        terbesar = (c > terbesar) ? c : terbesar;
        System.out.println("Bilangan terbesar: " + terbesar);

    inp07.close();
    }
}