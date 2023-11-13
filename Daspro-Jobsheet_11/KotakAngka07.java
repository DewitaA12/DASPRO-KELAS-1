import java.util.Scanner;

public class KotakAngka07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

// Memasukkan nilai N dari input pengguna
        System.out.print("Masukkan nilai N (min 3) = ");
        int N = sc7.nextInt();

        for (int iO = 1; iO <= N; iO++) {
            for (int iI = 1; iI <= N; iI++) {

// Menggunakan kondisi untuk menentukan apakah saat ini berada di batas bingkai atau di tengah
                if (iO == 1 || iO == N || iI == 1 || iI == N) {
                    System.out.print(N + " ");
                } else {
                    
// Spasi untuk area tengah
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        sc7.close();
    }
}

