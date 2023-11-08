import java.util.Scanner;
public class Star07 {
    public static void main(String[] args){
    Scanner sc7 = new Scanner(System.in);
    System.out.print("Masukkan nilai N = ");
    int N = sc7.nextInt();
    for (int i=1; i<=N; i++){
        System.out.print("*");
    }
    sc7.close();
    }
}