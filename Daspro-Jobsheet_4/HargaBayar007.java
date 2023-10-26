 import java.util.Scanner;
 public class HargaBayar007{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int harga, jumlah, Hlmbuku;
    double dis, total, bayar, jmlDis;
    String MerkBuku;
    System.out.println("Masukkan harga barang yang dibeli ");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
    jumlah=input.nextInt();
    System.out.println("Masukkan Merk Buku yang dibeli ");
    MerkBuku=input.next();
    System.out.println("Masukkan jumlah halaman buku yang dibeli ");
    Hlmbuku=input.nextInt();
    System.out.println("Masukkan besar diskon yang didapat ");
    dis=input.nextDouble();
    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    System.out.println("========STRUCK========");
    System.out.println("Merk Buku " +MerkBuku);
    System.out.println("Jumlah Halaman " +Hlmbuku);
    System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    input.close();
    }
 }