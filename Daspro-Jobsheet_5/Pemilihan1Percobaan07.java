import java.util.Scanner;
public class Pemilihan1Percobaan07 {
    public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);
    System.out.println("Masukkan Angka :");
    int angka = input07.nextInt();
    if (angka %2 == 0){
        System.out.println("Angka " + angka + " Bilangan GENAP");
    }else {
        System.out.println("Angka " + angka + " Bilangan GANJIL");
    }
    }
}