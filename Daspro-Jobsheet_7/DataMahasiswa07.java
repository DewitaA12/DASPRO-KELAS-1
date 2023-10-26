import java.util.Scanner;
public class DataMahasiswa07 {
    public static void main(String[] args) {
        String[] nama = new String[30];
        String[] gender = new String[30];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<30;i++){
        System.out.println("Nama Mahasiswa " + (i+1) + ":");
        nama[i] = sc.nextLine();
        System.out.println("Jenis Kelamin " + (i+1) + ":");
        gender[i] = sc.nextLine();
        System.out.println("Daftar Mahasiswa Perempuan :");
        if (gender[i].equalsIgnoreCase("p")){
                System.out.println(nama[i]);
        }
            sc.close();
        }
}}