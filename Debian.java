import java.util.ArrayList;
import java.util.Scanner;

public class Debian {
    static Scanner input = new Scanner(System.in);
    static String[][] tempat = new String[3][50];
    static double totalPembayaran = 0;
    static ArrayList<String> daftarBarang = new ArrayList<>();


    static void menuUtama() {
        System.out.println("\n");
        System.out.println("|====================================|");
        System.out.println("|                                    |");
        System.out.println("|  Selamat datang di program DEBIAN  |");
        System.out.println("|                                    |");
        System.out.println("|====================================|");
        System.out.println("|                MENU                |");
        System.out.println("|1. Admin                            |");
        System.out.println("|2. Pelanggan                        |");
        System.out.println("|3. Tutup Program                    |");
        System.out.println("|====================================|");
        System.out.print("Pilih menu (1/2/3) : ");
    }

    static void admin() {
        String username, password;

        System.out.print("Masukkan username : ");
        username = input.nextLine();
        System.out.print("Masukkan password : ");
        password = input.nextLine();

        if (username.equals("SYAHRUL") && password.equals("SYAHRUL")) {
            System.out.println("Selamat Anda berhasil login.");
        } else {
            System.out.println("Maaf username dan password yang Anda masukkan salah, silahkan ulangi lagi.");
            return;
        }

        boolean exitProgram = false;
        while (!exitProgram) {
            boolean keluarMenuAdmin = false;

            while (!keluarMenuAdmin) {
                System.out.println("\n");
                System.out.println("|====================================|");
                System.out.println("|              Menu Admin            |");
                System.out.println("|====================================|");
                System.out.println("|     1. Input Barang Masuk          |");
                System.out.println("|     2. Data Barang Masuk           |");
                System.out.println("|     3. Data Pengeluaran            |");
                System.out.println("|     4. Data Pendapatan             |");
                System.out.println("|     5. Gaji Karyawan               |");
                System.out.println("|     6. Keluar dari menu Admin      |");
                System.out.println("|====================================|");
                System.out.print("Pilih menu (1/2/3/4/5): ");
                int admin = input.nextInt();
                input.nextLine();

                switch (admin) {
                    case 1:
                        barangMasuk();
                        break;
                    case 2:
                        tampilkanDaftarBarang();
                        break;
                    case 3:
                        dataPengeluaran();
                        break;
                    case 4:
                        dataPendapatan();
                        break;
                    case 5:
                        dataPendapatan();gajiKaryawan();
                    case 6:
                        System.out.println("Keluar dari menu Admin");
                        keluarMenuAdmin = true;
                        break;
                    default:
                        System.out.println("Menu tidak valid. Silahkan pilih 1, 2, 3, 4, atau 5.");
                }
            }
            System.out.print("Kembali ke menu utama? (y/n): ");
            input.nextLine();
            String kembali = input.next();
            if (kembali.equalsIgnoreCase("y")) {
                exitProgram = true;
            }
        }
        menuUtama();
    }
    
    static void barangMasuk() {
        boolean lanjutInput = true;
        do {
            System.out.println("\n=========================== Masukkan Barang ============================");
            System.out.print("Nama Barang        : ");
            String namaBarang = input.nextLine();
            System.out.print("Jumlah Barang (kg) : ");
            int jumlahBarang = input.nextInt();
            System.out.print("Harga Barang (/kg) : Rp");
            int hargaBarang = input.nextInt();
            input.nextLine();

            String dataBarang = "| Nama Barang        : " + namaBarang + "\n| Jumlah Barang (kg) : "+ jumlahBarang + "\n| Harga Barang (/kg) : Rp." + hargaBarang ;
            daftarBarang.add(dataBarang);

            System.out.println("Barang masuk berhasil direkam.");

            System.out.println("Apakah Anda mau menginput barang lagi? (y/n)");
            String pilihanBarang = input.nextLine();
            lanjutInput = pilihanBarang.equalsIgnoreCase("y");

        } while (lanjutInput);
    }

    static void tampilkanDaftarBarang() {
        System.out.println("\n========================= Daftar Barang Masuk =====================");
        for (String barang : daftarBarang) {
            System.out.println(barang);
            System.out.println("------------------------------------------------------------------");
        }
        System.out.println("==================================================================");
    }

    static void dataPengeluaran() {
        System.out.println("1. Januari");
        System.out.println("2. Februari");
        System.out.println("3. Maret");
        System.out.println("4. April");
        System.out.println("5. Mei");
        System.out.println("6. Juni");
        System.out.println("7. July");
        System.out.println("8. Agustus");
        System.out.println("9. September");
        System.out.println("10. Oktober");
        System.out.println("11. November");
        System.out.println("12. Desember");

        for (int nomorBulan = 1; nomorBulan <= 12; nomorBulan++) {
            boolean lanjutInput = true;

            do {
                System.out.print("Pilih bulan yang akan Anda hitung pengeluarannya: ");
                nomorBulan = input.nextInt();

                switch (nomorBulan) {
                    case 1:
                        System.out.println("Anda memilih bulan Januari.");
                        int totalPengeluaranJanuari = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanJanuari = input.nextInt();
                        totalPengeluaranJanuari += keperluanJanuari;

                        System.out.println("Total pengeluaran untuk Januari: Rp" + totalPengeluaranJanuari);
                        break;
                    case 2:
                        System.out.println("Anda memilih bulan Februari.");
                        int totalPengeluaranFebruari = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanFebruari = input.nextInt();
                        totalPengeluaranFebruari += keperluanFebruari;

                        System.out.println("Total pengeluaran untuk Februari: Rp" + totalPengeluaranFebruari);
                        break;
                    case 3:
                        System.out.println("Anda memilih bulan Maret.");
                        int totalPengeluaranMaret = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanMaret = input.nextInt();
                        totalPengeluaranMaret += keperluanMaret;

                        System.out.println("Total pengeluaran untuk Maret: Rp" + totalPengeluaranMaret);
                        break;
                    case 4:
                        System.out.println("Anda memilih bulan April.");
                        int totalPengeluaranApril = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanApril = input.nextInt();
                        totalPengeluaranApril += keperluanApril;

                        System.out.println("Total pengeluaran untuk April: Rp" + totalPengeluaranApril);
                        break;
                    case 5:
                        System.out.println("Anda memilih bulan Mei.");
                        int totalPengeluaranMei = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanMei = input.nextInt();
                        totalPengeluaranMei += keperluanMei;

                        System.out.println("Total pengeluaran untuk Mei: Rp" + totalPengeluaranMei);
                        break;
                    case 6:
                        System.out.println("Anda memilih bulan Juni.");
                        int totalPengeluaranJuni = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanJuni = input.nextInt();
                        totalPengeluaranJuni += keperluanJuni;

                        System.out.println("Total pengeluaran untuk Juni: Rp" + totalPengeluaranJuni);
                        break;
                    case 7:
                        System.out.println("Anda memilih bulan Juli.");
                        int totalPengeluaranJuli = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanJuli = input.nextInt();
                        totalPengeluaranJuli += keperluanJuli;

                        System.out.println("Total pengeluaran untuk Juli: Rp" + totalPengeluaranJuli);
                        break;
                    case 8:
                        System.out.println("Anda memilih bulan Agustus.");
                        int totalPengeluaranAgustus = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanAgustus = input.nextInt();
                        totalPengeluaranAgustus += keperluanAgustus;

                        System.out.println("Total pengeluaran untuk Agustus: Rp" + totalPengeluaranAgustus);
                        break;
                    case 9:
                        System.out.println("Anda memilih bulan September.");
                        int totalPengeluaranSeptember = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanSeptember = input.nextInt();
                        totalPengeluaranSeptember += keperluanSeptember;

                        System.out.println("Total pengeluaran untuk September: Rp" + totalPengeluaranSeptember);
                        break;
                    case 10:
                        System.out.println("Anda memilih bulan Oktober.");
                        int totalPengeluaranOktober = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanOktober = input.nextInt();
                        totalPengeluaranOktober += keperluanOktober;

                        System.out.println("Total pengeluaran untuk Oktober:Rp " + totalPengeluaranOktober);
                        break;
                    case 11:
                        System.out.println("Anda memilih bulan November.");
                        int totalPengeluaranNovember = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanNovember = input.nextInt();
                        totalPengeluaranNovember += keperluanNovember;

                        System.out.println("Total pengeluaran untuk November: Rp" + totalPengeluaranNovember);
                        break;
                    case 12:
                        System.out.println("Anda memilih bulan Desember.");
                        int totalPengeluaranDesember = 0;

                        System.out.print("Masukkan jumlah pengeluaran : Rp");
                        int keperluanDesember = input.nextInt();
                        totalPengeluaranDesember += keperluanDesember;

                        System.out.println("Total pengeluaran untuk Desember: Rp" + totalPengeluaranDesember);
                        break;
                    default:
                        System.out.println("Pilihan bulan tidak valid");
                }
                System.out.print("Apakah Anda ingin menginput lagi di bulan " + namaBulan(nomorBulan) + "? (y/n): ");
                String pilihan = input.next();

                lanjutInput = pilihan.equalsIgnoreCase("y");

                if (!lanjutInput) {
                    return;
                }

            } while (lanjutInput);
        }
    }

    static void dataPendapatan() {
        System.out.println("1. Januari");
        System.out.println("2. Februari");
        System.out.println("3. Maret");
        System.out.println("4. April");
        System.out.println("5. Mei");
        System.out.println("6. Juni");
        System.out.println("7. July");
        System.out.println("8. Agustus");
        System.out.println("9. September");
        System.out.println("10. Oktober");
        System.out.println("11. November");
        System.out.println("12. Desember");

        for (int nomorBulan = 1; nomorBulan <= 12; nomorBulan++) {
            boolean lanjutInput = true;

            do {
                System.out.print("Pilih bulan yang akan Anda hitung pendapatannya: ");
                nomorBulan = input.nextInt();

                switch (nomorBulan) {
                    case 1:
                        System.out.println("Anda memilih bulan Januari.");
                        int totalPengeluaranJanuari = 0;
                        System.out.print("Masukkan jumlah pendapatan: Rp");
                        int keperluanJanuari = input.nextInt();
                        totalPengeluaranJanuari += keperluanJanuari;
                        System.out.println("Total pendapatan untuk Januari: Rp" + totalPengeluaranJanuari);
                        break;
                    case 2:
                        System.out.println("Anda memilih bulan Februari.");
                        int totalPengeluaranFebruari = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanFebruari = input.nextInt();
                        totalPengeluaranFebruari += keperluanFebruari;
                        System.out.println("Total pendapatan untuk Februari: Rp" + totalPengeluaranFebruari);
                        break;
                    case 3:
                        System.out.println("Anda memilih bulan Maret.");
                        int totalPengeluaranMaret = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanMaret = input.nextInt();
                        totalPengeluaranMaret += keperluanMaret;
                        System.out.println("Total pendapatan untuk Maret: Rp" + totalPengeluaranMaret);
                        break;
                    case 4:
                        System.out.println("Anda memilih bulan April.");
                        int totalPengeluaranApril = 0;
                        System.out.print("Masukkan jumlah  pendapatan : Rp");
                        int keperluanApril = input.nextInt();
                        totalPengeluaranApril += keperluanApril;
                        System.out.println("Total pendapatan untuk April: Rp" + totalPengeluaranApril);
                        break;
                    case 5:
                        System.out.println("Anda memilih bulan Mei.");
                        int totalPengeluaranMei = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanMei = input.nextInt();
                        totalPengeluaranMei += keperluanMei;
                        System.out.println("Total pendapatan untuk Mei: Rp" + totalPengeluaranMei);
                        break;
                    case 6:
                        System.out.println("Anda memilih bulan Juni.");
                        int totalPengeluaranJuni = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanJuni = input.nextInt();
                        totalPengeluaranJuni += keperluanJuni;
                        System.out.println("Total pendapatan untuk Juni: Rp" + totalPengeluaranJuni);
                        break;
                    case 7:
                        System.out.println("Anda memilih bulan Juli.");
                        int totalPengeluaranJuli = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanJuli = input.nextInt();
                        totalPengeluaranJuli += keperluanJuli;
                        System.out.println("Total pendapatan untuk Juli: Rp" + totalPengeluaranJuli);
                        break;
                    case 8:
                        System.out.println("Anda memilih bulan Agustus.");
                        int totalPengeluaranAgustus = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanAgustus = input.nextInt();
                        totalPengeluaranAgustus += keperluanAgustus;
                        System.out.println("Total pendapatan untuk Agustus: Rp" + totalPengeluaranAgustus);
                        break;
                    case 9:
                        System.out.println("Anda memilih bulan September.");
                        int totalPengeluaranSeptember = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanSeptember = input.nextInt();
                        totalPengeluaranSeptember += keperluanSeptember;
                        System.out.println("Total pendapatan untuk September: Rp" + totalPengeluaranSeptember);
                        break;
                    case 10:
                        System.out.println("Anda memilih bulan Oktober.");
                        int totalPengeluaranOktober = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanOktober = input.nextInt();
                        totalPengeluaranOktober += keperluanOktober;
                        System.out.println("Total pendapatan untuk Oktober:Rp " + totalPengeluaranOktober);
                        break;
                    case 11:
                        System.out.println("Anda memilih bulan November.");
                        int totalPengeluaranNovember = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanNovember = input.nextInt();
                        totalPengeluaranNovember += keperluanNovember;
                        System.out.println("Total pendapatan untuk November: Rp" + totalPengeluaranNovember);
                        break;
                    case 12:
                        System.out.println("Anda memilih bulan Desember.");
                        int totalPengeluaranDesember = 0;
                        System.out.print("Masukkan jumlah pendapatan : Rp");
                        int keperluanDesember = input.nextInt();
                        totalPengeluaranDesember += keperluanDesember;
                        System.out.println("Total pendapatan untuk Desember: Rp" + totalPengeluaranDesember);
                        break;
                    default:
                        System.out.println("Pilihan bulan tidak valid");
                }
                System.out.print("Apakah Anda ingin menginput lagi di bulan " + namaBulan(nomorBulan) + "? (y/n): ");
                String pilihan = input.nextLine();

                lanjutInput = pilihan.equalsIgnoreCase("y");

                if (!lanjutInput) {
                    return;
                }

            } while (lanjutInput);
        }

    }

    static String namaBulan(int nomorBulan) {
        String[] namaBulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
                "Oktober", "November", "Desember" };
        return namaBulan[nomorBulan - 1];
    }

    static void gajiKaryawan() {
        System.out.println("\n");
        System.out.print("Masukkan nama karyawan : ");
        String namaKarywan = input.nextLine();
        System.out.print("Masukkan gaji pokok karyawan : Rp");
        int gajiPokok = input.nextInt();
        System.out.print("Masukkan tunjangan : Rp");
        int tunjangan = input.nextInt();
        System.out.print("Masukkan jam lembur karyawan : ");
        int jamLembur = input.nextInt();
        System.out.print("Masukkan potongan gaji karyawan : Rp");
        int potonganGaji = input.nextInt();

        int totji = gajiPokok + tunjangan + jamLembur * 10000 - potonganGaji;

        System.out.println("\nRincian Gaji Karyawan");
        System.out.println("Nama Karyawan       : " + namaKarywan);
        System.out.println("Gaji Pokok          : Rp" + gajiPokok);
        System.out.println("Tunjangan           : Rp" + tunjangan);
        System.out.println("Tambahan Jam Lembur : Rp" + jamLembur * 10000);
        System.out.println("Potongan Pajak      : Rp" + potonganGaji);
        System.out.println("===================================");
        System.out.println("Total Gaji          : Rp" + totji);
    }

    static void pelanggan() {
        while (true) {
            displayMainMenu();
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    inputPesanan();
                    break;
                case 2:
                    inputMeja();
                    break;
                case 3:
                    reservasiTempat();
                    break;
                case 4:
                    pembayaranPelanggan();
                    break;
                case 5:
                    System.out.println("Terima kasih! Anda keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1, 2, 3, atau 4.");
            }
            continue;
        }
    }

    static void displayMainMenu() {
        System.out.println("\n");
        System.out.println("|====================================|");
        System.out.println("|                                    |");
        System.out.println("|          RESTAURANT DEBIAN         |");
        System.out.println("|                                    |");
        System.out.println("|====================================|");
        System.out.println("|                MENU                |");
        System.out.println("|1. Input pesanan pelanggan          |");
        System.out.println("|2. Input meja pelanggan             |");
        System.out.println("|3. Reservasi tempat                 |");
        System.out.println("|4. Pembayaran pelanggan             |");
        System.out.println("|5. Exit                             |");
        System.out.println("|====================================|");
        System.out.print("Pilih menu (1/2/3/4) : ");
    }

    static void inputPesanan() {
        System.out.println("\n");
        System.out.println("|====================================|");
        System.out.println("|                                    |");
        System.out.println("|                MENU 1              |");
        System.out.println("|                                    |");
        System.out.println("|====================================|");
        System.out.println("|1. Makanan & Minuman                |");
        System.out.println("|2. Exit                             |");
        System.out.println("|====================================|");
        System.out.print("Pilih menu (1/2/) : ");
        int produk = input.nextInt();
        input.nextLine();

        if (produk == 1) {
            System.out.println("\n");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|            PILIH MAKANAN           |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|   1. Nasi Goreng      Rp 10.000    |");
            System.out.println("|   2. Ayam Geprek      Rp 12.000    |");
            System.out.println("|   3. Lalapan Ayam     Rp 15.000    |");
            System.out.println("|   4. Lalapan Lele     Rp 12.000    |");
            System.out.println("|   5. Lalapan Bebek    Rp 20.000    |");
            System.out.println("|   6. Ayam Bakar       Rp 15.000    |");
            System.out.println("|   7. Mie Ayam         Rp 8.000     |");
            System.out.println("|   8. Ikan Bakar       Rp 25.000    |");
            System.out.println("|   9. Tumis Kangkung   Rp 7.000     |");
            System.out.println("|   10. Cumi Asam Manis Rp 20.000    |");
            System.out.println("| Masukkan angka 0 jika tidak memesan|");
            System.out.println("|                                    |");
            System.out.println("|====================================|");

            System.out.print("Pilih makanan 1/2/3/4/5/6/7/8/9/10 : ");
            int makanan = input.nextInt();

            int total_makan = 0;
            String nama_makanan = null;
            int jum_porsi = 0;

            switch (makanan) {
                case 1:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 10000;
                    nama_makanan = "Nasi Goreng";
                    System.out.println("Nasi Goreng " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 2:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 12000;
                    nama_makanan = "Ayam Geprek";
                    System.out.println("Ayam Geprek " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 3:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 15000;
                    nama_makanan = "Lalapan Ayam";
                    System.out.println("Lalapan Ayam " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 4:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 12000;
                    nama_makanan = "Lalapan Lele";
                    System.out.println("Lalapan Lele " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 5:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 20000;
                    nama_makanan = "Lalapan Bebek";
                    System.out.println("Lalapan Bebek " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 6:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 15000;
                    nama_makanan = "Ayam Bakar";
                    System.out.println("Ayam Bakar " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 7:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 8000;
                    nama_makanan = "Mie Ayam";
                    System.out.println("Mie Ayam " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 8:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 25000;
                    nama_makanan = "Ikan Bakar";
                    System.out.println("Ikan Bakar " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 9:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 7000;
                    nama_makanan = "Tumis Kangkung";
                    System.out.println("Tumis Kangkung " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                case 10:
                    System.out.print("Berapa porsi : ");
                    jum_porsi = input.nextInt();
                    total_makan = jum_porsi * 20000;
                    nama_makanan = "Cumi Asam Manis";
                    System.out.println("Cumi Asam Manis " + jum_porsi + " Porsi : Rp" + total_makan);
                    break;
                default:
                    System.out.println("Maaf pilihan tidak tersedia");
                    break;

            }
            System.out.println("\n");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|            PILIH MINUMAN           |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|   1. Es Teh           Rp 3.000     |");
            System.out.println("|   2. Teh Hangat       Rp 3.000     |");
            System.out.println("|   3. Es Jeruk         Rp 4.000     |");
            System.out.println("|   4. Jeruk Hangat     Rp 4.000     |");
            System.out.println("|   5. Es Coklat        Rp 8.000     |");
            System.out.println("|   6. Es Cendol        Rp 5.000     |");
            System.out.println("|   7. Es Buah          Rp 8.000     |");
            System.out.println("|   8. Soda Gembira     Rp 10.000    |");
            System.out.println("|   9. Es Cincau        Rp 5.000     |");
            System.out.println("|   10. Aneka Jus       Rp 7.000     |");
            System.out.println("| Masukkan angka 0 jika tidak memesan|");
            System.out.println("|                                    |");
            System.out.println("|====================================|");

            System.out.print("Pilih minuman 1/2/3/4/5/6/7/8/9/10 : ");
            int minuman = input.nextInt();

            String nama_minum = null;
            int total_minum = 0;
            int jum_gelas = 0;

            switch (minuman) {
                case 1:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 3000;
                    nama_minum = "Es Teh";
                    System.out.println("Es Teh " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 2:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 3000;
                    nama_minum = "Teh Hangat";
                    System.out.println("Teh Hangat " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 3:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 4000;
                    nama_minum = "Es Jeruk";
                    System.out.println("Es Jeruk " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 4:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 4000;
                    nama_minum = "Jeruk Hangat";
                    System.out.println("Jeruk Hangat " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 5:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 8000;
                    nama_minum = "Es Coklat";
                    System.out.println("Es Coklat " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 6:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 5000;
                    nama_minum = "Es Cendol";
                    System.out.println("Es Cendol " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 7:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 8000;
                    nama_minum = "Es Buah";
                    System.out.println("Es Buah " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 8:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 10000;
                    nama_minum = "Soda Gembira";
                    System.out.println("Soda Gembira " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 9:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 5000;
                    nama_minum = "Es Cincau";
                    System.out.println("Es Cincau " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                case 10:
                    System.out.print("Berapa porsi : ");
                    jum_gelas = input.nextInt();
                    total_minum = jum_gelas * 7000;
                    nama_minum = "Aneka Jus";
                    System.out.println("Aneka Jus " + jum_gelas + " Porsi : Rp" + total_minum);
                    break;
                default:
                    System.out.println("Maaf pilihan tidak tersedia");
                    break;
            }
            int total = total_makan + total_minum;
            System.out.println("\n");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|      KASIR RESTAURANT DEBIAN       |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("|                                    |");
            System.out.println("|           DAFTAR PEMBELIAN         |");
            System.out.println("|                                    |");
            System.out.println("|====================================|");
            System.out.println("                                     ");
            System.out.println("   Makanan      : " + nama_makanan);
            System.out.println("   Jumlah Porsi : " + jum_porsi);
            System.out.println("   Minuman      : " + nama_minum);
            System.out.println("   Jumlah Porsi : " + jum_gelas);
            System.out.println("|====================================|");
            System.out.println("   Total harga  : RP" + total);
            System.out.println("|====================================|");

        } else if (produk == 2) {
            System.out.println("Anda keluar dari menu input pesanan");
        }
    }

    static void inputMeja() {
        String next;

        while (true) {
            System.out.println("\n");
            System.out.println("|====================================|");
            System.out.println("|                MENU 2              |");
            System.out.println("|====================================|");
            System.out.println("|     1. Tempat pelanggan            |");
            System.out.println("|     2. Tampilkan daftar tempat     |");
            System.out.println("|     3. Exit                        |");
            System.out.println("|====================================|");
            System.out.print("Pilih menu (1/2/3): ");
            int m = input.nextInt();
            input.nextLine();

            switch (m) {
                case 1:
                    inputMejaPelanggan();
                    break;
                case 2:
                    tampilkanDaftarMeja();
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    return;
                default:
                    System.out.println("Menu tidak valid. Silahkan pilih 1, 2, atau 3.");
            }

            System.out.print("Input pelanggan lainnya? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    static void inputMejaPelanggan() {
        System.out.print("Masukkan nama pelanggan : ");
        String nama = input.nextLine();
        System.out.println("Pilih lantai 1, 2 atau 3.");
        System.out.print("Lantai        : ");
        int baris = input.nextInt();
        System.out.println("Pilih meja dari 1 - 50.");
        System.out.print("Meja          : ");
        int kolom = input.nextInt();
        input.nextLine();

        if (baris >= 1 && baris <= tempat.length && kolom >= 1 && kolom <= tempat[0].length) {
            if (tempat[baris - 1][kolom - 1] == null) {
                tempat[baris - 1][kolom - 1] = nama;
                System.out.println("Data pelanggan berhasil dimasukkan.");
                System.out.println("====================================================");
                System.out.println("||Nama : " + nama + "||Lantai : " + baris + "||Nomor Meja : "+ kolom);
                System.out.println("====================================================");
            } else {
                System.out.println("Maaf, meja sudah terisi. Silakan pilih meja lain.");
                System.out.print("Lantai : ");
                baris = input.nextInt();
                System.out.print("Meja   : ");
                kolom = input.nextInt();
                input.nextLine();

                if (tempat[baris - 1][kolom - 1] == null) {
                    tempat[baris - 1][kolom - 1] = nama;
                    System.out.println("Data pelanggan berhasil dimasukkan.");
                } else {
                    System.out.println("Maaf, meja sudah terisi. Pembatalan input.");
                }
            }
        } else {
            System.out.println("Nomor lantai atau meja tidak valid. Silakan coba lagi.");
        }
    }

    static void tampilkanDaftarMeja() {
        System.out.println("Daftar pelanggan");
        for (int i = 0; i < tempat.length; i++) {
            for (int j = 0; j < tempat[i].length; j++) {
                String penontonNama = tempat[i][j];
                if (penontonNama != null) {
                    System.out.println("===================================================");
                    System.out.println("Lantai " + (i + 1) + "||Meja " + (j + 1) + ": " + penontonNama + " (Meja terisi)");
                    System.out.println("===================================================");
                } else {
                    System.out.println("===================================================");
                    System.out.println("Lantai " + (i + 1) + "||Meja " + (j + 1) + ": *** (Meja kosong)");
                    System.out.println("===================================================");
                }
            }
        }
    }

    static void reservasiTempat() {

        System.out.println("********************************************************************");
        System.out.println("||                                                                ||");
        System.out.println("||       Selamat Datang di Reservasi Tempat Restaurant Debian     ||");
        System.out.println("||                                                                ||");
        System.out.println("********************************************************************");
        System.out.print("Masukkan Nama Pemesan Tempat:");
        String nama = input.nextLine();

        boolean inputNamaValid = false;
        while (!inputNamaValid) {
            if (angkaCek(nama)) {
                System.out.println("Error: Harap masukkan nama tanpa melibatkan angka!");
            } else if (nama.length() > 20) {
                System.out.println("Error: Harap masukkan nama tanpa melebihi 20 karakter!");
            } else {
                inputNamaValid = true;
            }
        }

        System.out.println("Daftar Hari Untuk Reservasi Tempat :");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.println("Masukkan Hari Pemesanan Anda (dalam bentuk angka): ");
        int masukkanHari = input.nextInt();
        boolean inputHariValid = false;
        while (!inputHariValid) {
            if (masukkanHari < 1 || masukkanHari > 7) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 7!");
                System.out.println("Masukkan Hari Pemesanan Anda: ");
                masukkanHari = input.nextInt();
            } else {
                System.out.println("Anda Memesan Hari : " + masukkanHari);
                inputHariValid = true;
            }
        }
        System.out.print("Masukkan Jumlah Tamu Yang Hadir:");
        int tamu = input.nextInt();

        System.out.println("Daftar Jam Untuk Reservasi Tempat :");
        System.out.println("1. 08.00 - 12.00 ");
        System.out.println("2. 13.00 - 17.00 ");
        System.out.println("3. 18.00 - 22.00 ");
        System.out.println("4. 08.00 - 17.00 ");
        System.out.println("5. 13.00 - 22.00 ");
        System.out.println("6. 08.00 - 22.00 ");
        System.out.println("Masukkan Jam Pemesanan Anda (Dalam bentuk angka):");
        int jamdanharga = input.nextInt();

        boolean inputJamValid = false;
        while (!inputJamValid) {
            if (jamdanharga < 1 || jamdanharga > 7) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 6!");
                System.out.println("Masukkan Jam Pemesanan Anda (Dalam bentuk angka):");
                jamdanharga = input.nextInt();
            } else {
                System.out.println("Anda Memesan Jam dengan Harga : " + jamdanharga);
                inputJamValid = true;
            }
        }

        System.out.println("Daftar Ruangan Yang Tersedia :");
        System.out.println("1. Lantai 1 ");
        System.out.println("2. Lantai 2 ");
        System.out.println("3. Lantai 3 ");
        System.out.println("Masukkan Ruangan Pemesanan Anda (Dalam Bentuk Angka) :");
        int ruangan = input.nextInt();
        boolean inputLantaiValid = false;
        while (!inputLantaiValid) {
            if (ruangan < 1 || ruangan > 3) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 3!");
                System.out.println("Masukkan Ruangan Pemesanan Anda (Dalam bentuk angka):");
                ruangan = input.nextInt();
            } else {
                System.out.println("Anda Memesan Ruangan : " + ruangan);
                String[] lantaiMenu = { "Lantai 1", "Lantai 2", "Lantai 3" };
                System.out.println("Anda memilih tempat : " + lantaiMenu[ruangan - 1]);
                String rincianTempat = lantaiMenu[ruangan - 1];
                inputLantaiValid = true;
            }
        }

        System.out.println("Daftar Paket Menu Yang Tersedia :");
        System.out.println("1. Paket A : Ayam Geprek, Lalapan Bebek, Es Jeruk, Es Cincau, Es Teh");
        System.out.println("2. Paket B : Ayam Bakar, Lalapan Lele, Es Teh, Es Coklat");
        System.out.println("3. Paket C : Ikan Bakar, Tumis Kangkung, Es Buah, Es Teh");
        System.out.println("4. Paket D : Cumi Asam Manis, Nasi Goreng, Es Cendol, Es Teh");
        System.out.println("5. Paket E : Lalapan Bebek, Mie Ayam, Soda Gembira, Es Teh");
        System.out.println("Masukkan Pilihan Paket Menu Pemesanan Anda (Dalam Bentuk Angka) :");
        int menu = input.nextInt();
        boolean inputMenuValid = false;
        while (!inputMenuValid) {
            if (menu < 1 || menu > 5) {
                System.out.println("Error: Harap Anda memasukkan angka dari 1 sampai 5!");
                System.out.println("Masukkan Pilihan Paket Menu Pemesanan Anda (Dalam Bentuk Angka):");
                menu = input.nextInt();
            } else {
                inputMenuValid = true;
                System.out.println("Anda Memesan Paket Menu : " + menu);

                String[] makananMenu = { "Ayam Geprek, Lalapan Bebek, Es Jeruk, Es Cincau, Es Teh",
                        "Ayam Bakar, Lalapan Lele, Es Teh, Es Coklat",
                        "Ikan Bakar, Tumis Kangkung, Es Buah, Es Teh",
                        "Cumi Asam Manis, Nasi Goreng, Es Cendol, Es Teh",
                        "Lalapan Bebek, Mie Ayam, Soda Gembira, Es Teh" };

                System.out.println("Makanan dan Minuman : " + makananMenu[menu - 1]);
                String rincianMenu = makananMenu[menu - 1];
            }
        }

        System.out.println("************************************");
        System.out.println("|| Terimakaih Atas Pemesanan Anda ||");
        System.out.println("||     Rincian Pemesanan Anda     ||");
        System.out.println("************************************");
        System.out.println("Nama \t\t\t\t: " + nama);
        System.out.println("Jumlah Tamu \t\t\t: " + tamu);
        System.out.println("Hari \t\t\t\t: " + masukkanHari);
        System.out.println("Jam dan Harga \t\t\t: " + jamdanharga);
        System.out.println("Ruangan(Lantai) \t\t\t: " + ruangan);
        System.out.println("Menu \t\t\t\t: " + menu);

    }

    public static boolean angkaCek(String isDigitExist) {
        for (char cekAngka : isDigitExist.toCharArray()) {
            if (Character.isDigit(cekAngka)) {
                return true;
            }
        }
        return false;
    }

    static void pembayaranPelanggan() {
        System.out.println("\n||====================================||");
        System.out.println("||          METODE PEMBAYARAN          ||");
        System.out.println("||=====================================||");
        System.out.println("||       1. Tunai                      ||");
        System.out.println("||=====================================||");
        System.out.println("Pilih metode pembayaran (1) : ");
        int metode = input.nextInt();
        input.nextLine();

        switch (metode) {
            case 1:
                pembayaranTunai();
                break;
            default:
                System.out.println("Metode pembayaran tidak valid. Harap pilih kembali (1) : ");
                break;
        }
    }

    static void pembayaranTunai() {
        System.out.print("Masukkan jumlah yang harus dibayar : Rp");
        double jumlahPembayaranTunai = input.nextDouble();
        System.out.print("Masukkan nominal uang untuk membayar : Rp");
        double totalPembayaran = input.nextDouble();

        if (totalPembayaran >= jumlahPembayaranTunai) {
            double kembalian = totalPembayaran - jumlahPembayaranTunai;
            System.out.println("Pembayaran tunai berhasil.");
            System.out.println("Kembalian : " + kembalian);
            totalPembayaran = 0;
        } else {
            System.out.println("JUmlah pembayaran tidak mencukupi. Masukkan ulang jumlah pembayaran yang cukup.");
        }
    }
    public static void main(String[] args) {
        while (true) {
            menuUtama();
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    admin();
                    break;
                case 2:
                    pelanggan();
                    break;
                case 3:
                    System.out.println("Terima kasih! Anda keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1, 2, 3, atau 4.");
            }
        }
    }
}