import java.util.Scanner;
public class ArrayTerbalik07 {
    public static void main (String[] args) {
    Scanner sc7 = new Scanner(System.in);
    String [] data = new String[10];
    for (int i = 0; i < data.length ; i++) {
        System.out.print("Masukkan Data ke- " +(i+1)+ " :");
        data[i]  = sc7.nextLine();
    } 
    for (int i = 9; i >= 0; i--){
    System.out.println(data[i]);
    }
    sc7.close();
    }
}