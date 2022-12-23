public class Ongkos extends Dimensi{

    final double hargaMinimum = 5000;
    double berat;

    void  setPanjang(double nilai){
        panjang = nilai;
    }

    void  setLebar(double nilai){
        lebar = nilai;
    }

    void  setTinggi(double nilai){
        tinggi = nilai;
    }

    public int ongkosKirim(){
        double volumeDimensi = volume();
        if (volumeDimensi <= 50){
            return (int) hargaMinimum;
        } else {
            return (int) berat * 5000;
        }
    }

}
