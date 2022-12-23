public class Main {

    public static void main(String[] args) {

        // Class Menghitung Luas

        Persegi Luas_Persegi = new Persegi(4);
        System.out.println("Luas Persegi " +  Luas_Persegi.hitungluas_Persegi());

        Segitiga Luas_Segitiga = new Segitiga(3, 4);
        System.out.println("Luas Segitiga " +  Luas_Segitiga.hitungluas_Segitiga());

        PersegiPanjang Luas_PersegiPanjang = new PersegiPanjang(7, 8);
        System.out.println("Luas Persegi Panjang " +  Luas_PersegiPanjang.hitungluas_PersegiPanjang());

        //**************************************************************************************//

        System.out.println(); // Hanya batas Jarak

        // Class Menghitung Keliling

        Persegi Keliling_Persegi = new Persegi(4);
        System.out.println("Keliling Persegi " +  Keliling_Persegi.hitungkeliling_Persegi());

        Segitiga Keliling_Segitiga = new Segitiga(4);
        System.out.println("Keliling Segitiga " +  Keliling_Segitiga.hitungkeliling_Segitiga());

        PersegiPanjang Keliling_PersegiPanjang = new PersegiPanjang(7, 8 );
        System.out.println("Keliling Persegi Panjang " +  Keliling_PersegiPanjang.hitungkeliling_PersegiPanjang());

    }

}