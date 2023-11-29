public class Percobaan107 {
    
//Fungsi Faktorial Rekursif
    public static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
            } else {
                return (n*faktorialRekursif(n-1));
            }
    }
//Fungsi Faktorial Iteratif
    public static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i>=1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
//Fungsi main
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }
}