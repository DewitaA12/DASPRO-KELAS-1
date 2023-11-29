import java.util.Scanner;
public class Tugas107 {
    
//Fungsi Descending Rekursif
    static void descRekursif(int n) {
        
        if (n >= 0) {
            System.out.print(n + ", ");
            descRekursif(n - 1);

        }
    }
//Fungsi Descending Iteratif
    static void descIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + ", ");
        }
    }

//Fungsi main
    public static void main(String[] args) {
            Scanner sc7 = new Scanner(System.in);
            int nilai;
    
            System.out.print("Masukkan nilai: ");
            nilai = sc7.nextInt();
    
            System.out.println("Deret descending dengan Rekursif: ");
            descRekursif(nilai);
            System.out.println();
    
            System.out.println("Deret descending dengan Iteratif: ");
            descIteratif(nilai);
            System.out.println();
    
        sc7.close();
       
    }
}