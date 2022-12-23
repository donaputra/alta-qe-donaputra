public class PersegiPanjang {

    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk mengitung luas PersegiPanjang
    public int hitungluas_PersegiPanjang(){return this.panjang * this.lebar;}

    // Method untuk mengitung keliling Persegi Panjang
    public int hitungkeliling_PersegiPanjang(){return this.panjang * 2 + (this.lebar * 2);}
}
