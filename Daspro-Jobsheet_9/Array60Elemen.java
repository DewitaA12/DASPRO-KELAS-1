import java.util.Scanner;
public class Array60Elemen {
    public static void main(String[] args) {
    Scanner sc7 = new Scanner(System.in);
    String [] data = new String [60];
    for (int i = 0 ; i < data.length ; i++) {
        System.out.print("Masukkan Data ke- " +(i+1)+ " :");
        data[i]  = sc7.nextLine();
    } 

    for (String d : data){
        System.out.println(d);
    }
    sc7.close();
    }
}