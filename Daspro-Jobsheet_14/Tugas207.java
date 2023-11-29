import java.util.Scanner;
public class Tugas207 {

    public static int penjumlahanRekursif(int n) {
        if (n <= 1) {
            System.out.print(n);
            return n;
        } else {
            int hasil = n + penjumlahanRekursif(n - 1);
            System.out.print(" + " + n);
            return hasil;
        }
        }
        public static void main(String[] args) {
            Scanner sc7 = new Scanner(System.in);
            System.out.print("Masukkan nilai : ");
            int bilangan = sc7.nextInt();
            int hasil = penjumlahanRekursif(bilangan);
            System.out.print(" = " + hasil);
            sc7.close();
        }
    }