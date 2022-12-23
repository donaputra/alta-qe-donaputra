public class Main {
    public static void main(String[] args) {

        // Class Menghitung Volume

        Kubus Volume_Kubus = new Kubus(10);
        System.out.println("Luas Persegi " +  Volume_Kubus.hitungvolume_Kubus());

        Balok Volume_Balok = new Balok(3, 6, 10);
        System.out.println("Volume Balok " +  Volume_Balok.hitungvolume_Kubus());

        Tabung Volume_Tabung = new Tabung(7, 10);
        System.out.println("Volume Tabung " + Volume_Tabung.hitungvolume_Tabung());
    }
}