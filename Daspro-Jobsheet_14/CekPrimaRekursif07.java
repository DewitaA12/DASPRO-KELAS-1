import java.util.Scanner;
public class CekPrimaRekursif07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int angka = sc7.nextInt(); 
        if (angkaPrima(angka, 2)) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima");
        }
        sc7.close();
    }

    // Fungsi rekursif untuk cek
    static boolean angkaPrima(int n, int i) {
        // Basis untuk fungsi rekursif
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        // Langkah rekursif
        return angkaPrima(n, i + 1);
    }
}
