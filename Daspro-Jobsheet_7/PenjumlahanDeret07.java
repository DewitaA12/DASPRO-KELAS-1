import java.util.Scanner;
public class PenjumlahanDeret07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        int total = 0;
        System.out.println("Masukkan nilai n :");
        int n = sc7.nextInt();
        for (int i = n; i>=1; i--) {
                total += i;
        }
        sc7.close();
        System.out.println("Hasil penjumlahan deret n sampai 1 adalah :" + total);
    }
}