import java.util.Scanner;
public class Jumlahbilangan07{
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        int  n, total; 
        System.out.println("Jumlah Total Bilangan dari n-1");
        System.out.print("Masukkan n :");
        n = sc7.nextInt();
        total = 0 + n;
        int i = n;
        while (i>=1){
            i = i-1;
            total += i;
        }
        System.out.println("Jadi jumlah total =" + total);
        sc7.close();
    }
}