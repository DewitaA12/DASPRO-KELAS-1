import java.util.Scanner;
public class Pemilihan2Percobaaan207 {
    public static void main(String[] args) {
        Scanner inp07 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalsudut;
        System.out.println("Masukkan sudut 1 :");
        sudut1 = inp07.nextInt();
        System.out.println("Masukkan sudut 2 :");
        sudut2 = inp07.nextInt();
        System.out.println("Masukkan sudut 3 :");
        sudut3 = inp07.nextInt();
        totalsudut = sudut1 + sudut2 + sudut3;
        if (totalsudut == 180) {
            if((sudut1 == 90||sudut2 == 90 || sudut3 == 90)){
            System.out.println("Segitiga Siku-Siku");
            } else if (sudut1 > 90||sudut2 > 90||sudut3 > 90){
            System.out.println("Segitiga Tumpul");
            } else if (sudut1 < 90 && sudut2 < 90 && sudut3 < 90){
            System.out.println("Segitiga Lancip");
            } else {
                System.out.println("Segitiga Sama Sisi");
            } 
        } else {
            System.out.println("Bukan Segitiga");
    }
    inp07.close();
}
}