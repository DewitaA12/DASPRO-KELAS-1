import java.util.Scanner;
public class PersamaanKuadrat07{
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int a, b, c; 
        double D, x1, x2;
        System.out.println("Masukkan Nilai a =");
        a = input07.nextInt();
        System.out.println("Masukkan Nilai b =");
        b = input07.nextInt();
        System.out.println("Masukkan Nilai c =");
        c = input07.nextInt();
        D = b*b - 4*a*c;
        if ( a == 0 ) {
            x1 = ((-b)/c);
            System.out.println("Maka nilai x1 yang memenuhi : " + x1);
        }else {
            if (D<0) {
                System.out.println("Bilangan Imajiner");
            }else {
                x1 = (-b/2*a) + (Math.sqrt(D) / (2*a));
                x2 = (-b/2*a) - (Math.sqrt(D) / (2*a));
                System.out.println("Nilai x1 yang memenuhi :" + x1);
                System.out.println("Nilai x2 yang memenuhi :" + x2);
            }  
    }
    input07.close();
}}