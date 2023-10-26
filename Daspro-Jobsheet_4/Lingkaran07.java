import java.util.Scanner;
public class Lingkaran07{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas;
        double phi;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();
        phi=3.14f;
        keliling= 2*phi*r;
        luas=phi*r*r;
        System.out.println("Keliling Lingkaran :" + keliling);
        System.out.println("Luas Lingkaran :" + luas);
        input.close();
    }
}