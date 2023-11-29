import java.util.Scanner;
public class Percobaan207 {

//Fungsi Pangkat Rekursif
public static int hitungPangkat(int x, int y) {
    if (y == 0) {
        return (1);
    }else {
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

    System.out.println(hitungPangkat(bil, pangkat));
        sc7.close();
}
}