import java.util.ArrayList;
import java.util.Scanner;
public class DaftarNamaMahasiswa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kelas :");
        String kelas = sc.nextLine();
        System.out.print("Masukkan Jumlah Mahasiswa :");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        int i=0;
        String NamaMahasiswa; String JenisKelamin;
        ArrayList <String> NamaMahasiswaP = new ArrayList<>();
        
        while (i < jumlahMahasiswa){
        System.out.print("Masukkan Nama " + (i+1) + ":");
        NamaMahasiswa = sc.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) " + (i+1) + ":");
        JenisKelamin = sc.nextLine();
        i++;

        if (JenisKelamin.equalsIgnoreCase("l")){
           continue;
        } else { JenisKelamin.equalsIgnoreCase ("p");
            NamaMahasiswaP.add(NamaMahasiswa);
        }
    }
    System.out.println("Kelas :" + kelas);
    System.out.println("Jumlah Mahasiswa :" + jumlahMahasiswa);
    System.out.println("Daftar Nama Mahasiswa Perempuan");
    for (String nama : NamaMahasiswaP){
    System.out.println(nama);
    }
    sc.close();
} 
}