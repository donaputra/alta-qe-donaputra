import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nama: ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
//        sapaAku(nama);
        for (int i = 0; i<1; i++)
        {
            sapaAku(nama);
        }
        System.out.println("Untuk " +nama +", Tolong hitung luas segitiga:");
        System.out.println("nilai alas: ");
        int alas = input.nextInt();
        System.out.println("nilai tinggi: ");
        int tinggi = input.nextInt();
        System.out.println("Luas Segita adalah : "+ hitungLuasSegitiga(alas, tinggi));
    }

    private static void sapaAku (String nama) {
        System.out.println("Selamat Siang "+ nama + ", Apa kabar? ");
    }

    private static int hitungLuasSegitiga(int alas, int tinggi) {
        int luas = 0;
        luas = (alas * tinggi) /2;

        return luas;
    }

}

