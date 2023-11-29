import java.util.Scanner;
public class Percobaan207 {

//Fungsi Pangkat Rekursif
public static int hitungPangkat(int x, int y) {
    if (y == 0) {
        System.out.print("x" + "1");
        return (1);
    }else {
        if (y>1){
            System.out.print(x + "x");
        }else {
            System.out.print(x);
        }
        return (x * hitungPangkat(x, y-1));
    }
}

//Fungsi Main
public static void main (String[] args){
    Scanner sc7 = new Scanner(System.in);
    System.out.print("Bilangan yang dihitung: ");
    int bil = sc7.nextInt();
    System.out.print("Pangkat: ");
    int pangkat = sc7.nextInt();

    System.out.print(bil + "^" + pangkat + " = ");
        int hasil = hitungPangkat(bil, pangkat);
        System.out.print(" = " + hasil);

        sc7.close();
}
}