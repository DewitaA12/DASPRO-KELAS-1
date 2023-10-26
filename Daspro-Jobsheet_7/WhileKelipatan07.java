import java.util.Scanner;
public class WhileKelipatan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelipatan, mean, counter=0, jumlah=0, i;
        System.out.print("Masukkan bilangan kelipatan (1-9) :");
        kelipatan = sc.nextInt();
        i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        mean = jumlah / counter;
        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata seluruh bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, mean);
        sc.close();
    }
}