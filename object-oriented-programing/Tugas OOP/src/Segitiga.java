public class Segitiga {
    int alas;
    int tinggi;

    int sisi_Segitiga;

    public Segitiga(int sisi_Segitiga) {
        this.sisi_Segitiga = sisi_Segitiga;
    }

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;

    }
    // Method untuk mengitung luas Segitiga
    public int hitungluas_Segitiga() {return this.alas * this.tinggi /2;}

    // Method untuk mengitung keliling Segitiga
    public int hitungkeliling_Segitiga(){
        return this.sisi_Segitiga * 3;
    }
}
