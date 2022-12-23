public class Main {
    public static void main(String[] args) {

        // Class Kalkulator

        Kalkulator Penjumlahan = new Kalkulator(3, 4);
        System.out.println("Hasil Penjumlahan " +  Penjumlahan.hitung_Penjumlahan());

        Kalkulator Pengurangan = new Kalkulator(15, 4);
        System.out.println("Hasil Pengurangan " +  Pengurangan.hitung_Pengurangan());

        Kalkulator Perkalian = new Kalkulator(10, 10);
        System.out.println("Hasil Perkalian " +  Perkalian.hitung_Perkalian());

        Kalkulator Pembagian = new Kalkulator(12, 3);
        System.out.println("Hasil Pembagian " +  Pembagian.hitung_Pembagian());

    }
}