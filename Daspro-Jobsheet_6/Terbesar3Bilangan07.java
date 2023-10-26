import java.util.Scanner;
public class Terbesar3Bilangan07 {
    public static void main(String[] args) {
        Scanner inp07 = new Scanner(System.in);
        int bil1, bil2, bil3, x;
        System.out.println("Masukkan Bilangan 1 :");
        bil1 = inp07.nextInt();
        System.out.println("Masukkan Bilangan 2 :");
        bil2 = inp07.nextInt();
        System.out.println("Masukkan Bilangan 3 :");
        bil3 = inp07.nextInt();
        if (bil1>bil2){
            if (bil1>bil3){
                System.out.println("Bilangan Terbesar Adalah =" + bil1);
            }else {
                System.out.println("Bilangan Terbesar adalah =" + bil3);
            }
        }else { 
            if (bil2>bil3){
         System.out.println("Bilangan Terbesar Adalah =" + bil2);
        }else {
            System.out.println("Bilangan Terbesar Adalah =" + bil3);
        }
    }
        inp07.close();
    }
}