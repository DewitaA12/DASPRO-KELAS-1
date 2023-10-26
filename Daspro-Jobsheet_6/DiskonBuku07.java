import java.util.Scanner;
public class DiskonBuku07 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Masukkan Jenis Buku =");
        String TypeBook = sc7.nextLine();
        System.out.println("Masukkan Jumlah Buku =");
        int jmlBook = sc7.nextInt();
        double Diskon;
        System.out.println("Masukkan Harga Satuan Buku =");
    int Price = sc7.nextInt();
    if (TypeBook.equalsIgnoreCase("Kamus")){
        if (jmlBook > 2){
            Diskon = Price*0.10 + Price*0.02 ;
    int TPrice = jmlBook*Price;
    double TDiskon = Diskon;
    int TPay = TPrice - (int)TDiskon;
    System.out.println("AB30 Bookstore");
    System.out.println("Jalan Ir. Soekarno No. 80, Surabaya");
    System.out.println("------------------------------------");
    System.out.println("Harga Satuan =" + Price);
    System.out.println("Total Harga =" +TPrice);
    System.out.println("Harga Diskon Sebesar =" + TDiskon);
    System.out.println("Total yang harus anda bayar =" + TPay);
    System.out.println("---***TERIMAKASIH***---");
        }else { 
            Diskon = Price*0.10;
    int TPrice = jmlBook*Price;
    double TDiskon = Diskon;
    int TPay = TPrice - (int)TDiskon;
    System.out.println("AB30 Bookstore");
    System.out.println("Jalan Ir. Soekarno No. 80, Surabaya");
    System.out.println("------------------------------------");
    System.out.println("Harga Satuan =" + Price);
    System.out.println("Total Harga =" +TPrice);
    System.out.println("Harga Diskon Sebesar =" + TDiskon);
    System.out.println("Total yang harus anda bayar =" + TPay);
    System.out.println("---***TERIMAKASIH***---");
        }
    } else if (TypeBook.equalsIgnoreCase("Novel")){
        if (jmlBook > 3) {
            Diskon = Price*0.07 + Price*0.02;
    int TPrice = jmlBook*Price;
    double TDiskon = Diskon;
    int TPay = TPrice - (int)TDiskon;
    System.out.println("AB30 Bookstore");
    System.out.println("Jalan Ir. Soekarno No. 80, Surabaya");
    System.out.println("------------------------------------");
    System.out.println("Harga Satuan =" + Price);
    System.out.println("Total Harga =" +TPrice);
    System.out.println("Harga Diskon Sebesar =" + TDiskon);
    System.out.println("Total yang harus anda bayar =" + TPay);
    System.out.println("---***TERIMAKASIH***---");
        }else { 
            Diskon = Price*0.07 + Price*0.01;
    int TPrice = jmlBook*Price;
    double TDiskon = Diskon;
    int TPay = TPrice - (int)TDiskon;
    System.out.println("AB30 Bookstore");
    System.out.println("Jalan Ir. Soekarno No. 80, Surabaya");
    System.out.println("------------------------------------");
    System.out.println("Harga Satuan =" + Price);
    System.out.println("Total Harga =" +TPrice);
    System.out.println("Harga Diskon Sebesar =" + TDiskon);
    System.out.println("Total yang harus anda bayar =" + TPay);
    System.out.println("---***TERIMAKASIH***---");
        }
    }else {
        if (jmlBook > 3){
            Diskon = Price*0.05;
    int TPrice = jmlBook*Price;
    double TDiskon = Diskon;
    int TPay = TPrice - (int)TDiskon;
    System.out.println("AB30 Bookstore");
    System.out.println("Jalan Ir. Soekarno No. 80, Surabaya");
    System.out.println("------------------------------------");
    System.out.println("Harga Satuan =" + Price);
    System.out.println("Total Harga =" +TPrice);
    System.out.println("Harga Diskon Sebesar =" + TDiskon);
    System.out.println("Total yang harus anda bayar =" + TPay);
    System.out.println("---***TERIMAKASIH***---");
        }else {
            Diskon = 0.00;
    int TPrice = jmlBook*Price;
    double TDiskon = Diskon;
    int TPay = TPrice - (int)TDiskon;
    System.out.println("AB30 Bookstore");
    System.out.println("Jalan Ir. Soekarno No. 80, Surabaya");
    System.out.println("------------------------------------");
    System.out.println("Harga Satuan =" + Price);
    System.out.println("Total Harga =" +TPrice);
    System.out.println("Harga Diskon Sebesar =" + TDiskon);
    System.out.println("Total yang harus anda bayar =" + TPay);
    System.out.println("---***TERIMAKASIH***---");
        }
    }
    sc7.close();
}}