import java.util.ArrayList;
import java.util.Scanner;
public class PrintBilExceptMultipleN07{
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        int n, x, i;
        System.out.println("Masukkan Nilai n :");
        n = sc7.nextInt();
        System.out.println("Masukkan Nilai x :");
        x = sc7.nextInt();
        ArrayList<Integer> HP = new ArrayList<>();
        for ( i = 1; i <= n; i++){
        if (i %x != 0){
            HP.add(i);
        }
        }
        System.out.println("Daftar Bilangan " + 1 + " Sampai " + n + " Kecuali Kelipatan " + x);
        for (int HPenyelesaian : HP) {
            System.out.println(HPenyelesaian);
        }
        sc7.close();
    }
}