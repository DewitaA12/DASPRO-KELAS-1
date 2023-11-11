import java.util.Scanner;
public class SegitigaAngka07 {
public static void main(String[] args) {
    Scanner sc7 = new Scanner(System.in);

    // Masukkan tinggi segitiga yang dibuat
    System.out.print("Masukkan nilai N :");
    int N = sc7.nextInt();

    int i = 1; 
    while(i <= N) {
//Membuat rata kanan
        int h = N - i;
        while (h>0){
            System.out.print(" ");
            h--;
        }
//Mencetak angka tiap baris
            int j = 1; 
            while(j <= i) { 
                System.out.print(j); 
                j++; 
            } 
    System.out.println();
    i++; 
    } 
    sc7.close();
    }
}