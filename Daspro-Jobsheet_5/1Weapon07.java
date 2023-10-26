import java.util.Scanner;
public class 1Weapon07{
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukkan jarak (m) =");
        int distance = input07.nextInt();
        if (distance <= 5){
            System.out.println("USE = Melee Weapon");
        }else {
            System.out.println("USE = Ranged Weapon");
        }
        input07.close();

    }
}