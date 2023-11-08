import java.util.Scanner;
public class Triangle07 {
    public static void main(String[] args){
    Scanner sc7 = new Scanner(System.in); 
    System.out.print("Masukkan nilai N = "); 
    int N = sc7.nextInt(); 
    int i = 0; 
    while(i <= N) { 
    int j = 0; 
    while(j <= i) { 
        System.out.print("*"); 
        j++; 
    } 
    System.out.println();
    i++; 
    } 
    sc7.close();
    }
}
