import java.util.Scanner;
public class DoWhileCuti07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti : " + jatahCuti);
                }else {
                System.out.println("Sisa jatah cuti anda tidak mencukupi");
                System.out.println("Masukkan jumlah hari yang sesuai!");
            }
        } else if (konfirmasi.equalsIgnoreCase("t")){
            System.out.print("OK");
            break;
        }
        }
        while (true);
        sc.close();
}
}