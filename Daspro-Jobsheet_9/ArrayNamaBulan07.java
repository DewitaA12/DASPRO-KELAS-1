import java.util.Scanner;
public class ArrayNamaBulan07 {
public static void main (String[] args){
Scanner sc7 = new Scanner(System.in);
int [] Ab = new int[12];
for (int i = 0; i < Ab.length; i++) {
System.out.print("Masukkan Angka :");
Ab[i] =  sc7.nextInt();
    if (Ab[i] == 1){
        System.out.println("JANUARI");
    }else if (Ab[i] == 2){
        System.out.println("FEBRUARI");
    }else if (Ab[i] == 3){
        System.out.println("MARET");
    }else if (Ab[i] == 4){
        System.out.println("APRIL");
    }else if (Ab[i] == 5){
        System.out.println("MEI");
    }else if (Ab[i] == 6){
        System.out.println("JUNI");
    }else if (Ab[i] == 7){
        System.out.println("JULI");
    }else if (Ab[i] == 8){
        System.out.println("AGUSTUS");
    }else if (Ab[i] == 9){
        System.out.println("SEPTEMBER");
    }else if (Ab[i] == 10){
        System.out.println("OKTOBER");
    }else if (Ab[i] == 11){
        System.out.println("NOVEMBER");
    }else if (Ab[i] == 12){
        System.out.println("DESEMBER");
    }else {
        System.out.println("Input Tidak Valid");
    }
    sc7.close();
}
}}