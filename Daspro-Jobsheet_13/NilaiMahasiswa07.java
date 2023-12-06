import java.util.Scanner;

public class NilaiMahasiswa07 {

    private int jmlhMahasiswa;
    private int jmlhMinggu;
    private int[][] nilaiMahasiswa;

    public static void main(String[] args) {
        NilaiMahasiswa07 nilai = new NilaiMahasiswa07();
        nilai.inputJumlahTugasMhs();
        nilai.jumlahNilaiMahasiswa();
        nilai.tampilNilaiMahasiswa();
        nilai.nilaiTertinggi();
        nilai.tampilMahasiswaNilaiTertinggi();
    }

    private void inputJumlahTugasMhs() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlhMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah minggu : ");
        jmlhMinggu = input.nextInt();
        nilaiMahasiswa = new int[jmlhMahasiswa][jmlhMinggu];
    }

    private void jumlahNilaiMahasiswa() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < jmlhMahasiswa; i++) {
            System.out.println("Masukkan data nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jmlhMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
        }
    }

    private void tampilNilaiMahasiswa() {
        System.out.println("Nilai Tugas Mahasiswa:");
        System.out.print("Mhs\\Minggu\t");
        for (int j = 0; j < jmlhMinggu; j++) {
            System.out.print("Minggu " + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < jmlhMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + "\t");
            for (int j = 0; j < jmlhMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    private void nilaiTertinggi() {
        int tertinggi = 0;
        int minggu = 0;

        for (int i = 0; i < jmlhMahasiswa; i++) {
            for (int j = 0; j < jmlhMinggu; j++) {
                if (nilaiMahasiswa[i][j] > tertinggi) {
                    tertinggi = nilaiMahasiswa[i][j];
                    minggu = j + 1;
                }
            }
        }
        System.out.println("Nilai tertinggi adalah " + tertinggi + " pada minggu ke-" + minggu);
    }

    private void tampilMahasiswaNilaiTertinggi() {
        int nilaiTertinggi = 0;
        int mahasiswaDenganNilaiTertinggi = 0;

        for (int i = 0; i < jmlhMahasiswa; i++) {
            for (int j = 0; j < jmlhMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaDenganNilaiTertinggi = i + 1;
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-" + mahasiswaDenganNilaiTertinggi + " dengan nilai " + nilaiTertinggi);
    }
}
