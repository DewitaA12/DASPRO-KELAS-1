import java.util.Scanner;
public class StarSquare07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Masukkan nilai N =");
        int N = sc7.nextInt();
        for (int iOuter=1; iOuter<=N; iOuter++){
        for (int i=0; i<=N;i++){
            System.out.print("*");
        }
        }
        sc7.close();
    }
}