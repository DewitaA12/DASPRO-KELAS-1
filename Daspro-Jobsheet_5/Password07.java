import java.util.Scanner;
public class Password07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukkan Username Anda : ");
        String User = input07.nextLine();
        System.out.println("Masukkan Password  Anda : ");
        String Password = input07.nextLine();
        if (User.equals("DewitaA") && Password.equals("da1264")){
            System.out.println("Selamat Datang");
        }else {
            System.out.println(" User dan Password SALAH");
        }
        input07.close();
    }
}