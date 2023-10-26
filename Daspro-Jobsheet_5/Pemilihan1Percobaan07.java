import java.util.Scanner;
public class Pemilihan1Percobaan07 {
    public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);
    System.out.println("Masukkan Angka :");
    int angka = input07.nextInt();
    String bilangan = (angka % 2 == 0 ) ? "GANJIL" : "GENAP" ;
    System.out.println(bilangan);
    }
}