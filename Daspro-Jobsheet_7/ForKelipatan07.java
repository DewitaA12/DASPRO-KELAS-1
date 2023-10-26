import java.util.Scanner;
public class ForKelipatan07 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int kelipatan, mean, counter=0, jumlah=0;
    System.out.print("Masukkan bilangan kelipatan (1-9) :");
    kelipatan = scan.nextInt();
    for (int i = 1; i <= 50; i++) { 
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
        }
        mean = jumlah / counter;
        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata seluruh bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, mean);
        scan.close();
    }
}