import java.util.Scanner;
public class StarTriangle07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);

// Masukkan Nilai N
        System.out.print("Masukkan nilai N (min 5) : ");
        int N = sc7.nextInt();
        int i = 0;
        while(i <= N) { 
// Membuat urutan dari banyak ke sedikit
            int j = N; 
            while(j >= i) { 
// Mencetak baris
                System.out.print("*"); 
                j--; 
            } 
            System.out.println();
            i++; 
            } 
            sc7.close();
            }
        }