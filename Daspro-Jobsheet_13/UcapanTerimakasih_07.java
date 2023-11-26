import java.util.Scanner;
public class UcapanTerimakasih_07 {

    public static String PenerimaUcapan(){
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc7.nextLine();
        sc7.close();

        return namaOrang;
    }

    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+ " for being the best teacher in the word.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void UcapanTambahan(String Tambahan){
        UcapanTerimakasih();
        System.out.println(Tambahan);
    }
    public static void main(String[] args) {
        String Tambahan = "I am grateful for your patience and understanding";
        UcapanTambahan(Tambahan);
    }
}