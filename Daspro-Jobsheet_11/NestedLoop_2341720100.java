import java.util.Scanner;
public class NestedLoop_2341720100 {
    public static void main(String[] args) {
    Scanner sc7 = new Scanner(System.in);
    Double[][] array = new Double[5][7];
    for(int i = 0; i<array.length; i++) {
    System.out.println("Kata ke-" + i);
    for (int j = 0; j < array.length; j++) {
        System.out.print("Hari ke-" + (j+i) + ": ");
        array[i][j] = sc7.nextDouble();
    }
    System.out.println();
    }for (int i = 0; i < array.length; i++) { 
        System.out.print("Kota ke-" + (i + 1) + ": "); 
        for (int j = 0; j < array[0].length; j++) { 
        System.out.print(array[i][j] + " "); 
        } 
        System.out.println(); 
       }
    sc7.close();       
    }
}