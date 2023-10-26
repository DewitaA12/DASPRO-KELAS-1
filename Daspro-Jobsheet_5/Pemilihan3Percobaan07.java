import java.util.Scanner;
public class Pemilihan3Percobaan07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        System.out.println("Masukkan angka pertama: ");
        angka1 = input07.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input07.nextDouble();
        System.out.println("Masukkan operator(+-*/): ");
        operator = input07.next().charAt(0);
        switch (operator) {
            case '+' :
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
        case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
        }

    }
}