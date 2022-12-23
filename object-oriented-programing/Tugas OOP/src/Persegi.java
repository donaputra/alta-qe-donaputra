public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    // Method untuk mengitung luas persegi
    public int hitungluas_Persegi(){
        return this.sisi * this.sisi;
    }

    // Method untuk mengitung keliling persegi
    public int hitungkeliling_Persegi(){
        return this.sisi * 4;
    }
}
