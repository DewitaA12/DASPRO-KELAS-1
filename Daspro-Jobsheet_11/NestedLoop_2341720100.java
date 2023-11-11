import java.util.Scanner;

public class NestedLoop_2341720100 {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        Double[][] array = new Double[5][7]; 

        // Mengisi array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                array[i][j] = sc7.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan array menggunakan foreach
        for (int i = 0; i < array.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            Double total = 0.0;
            for (Double suhu : array[i]) {
                System.out.print(suhu + " ");
                total += suhu;
            }
            double rata2 = total/array[i].length;
            System.out.println("Rata-rata suhu kota ke-" + (i+1) + ":" + rata2);
            System.out.println();
        }

        sc7.close();
    }
}
