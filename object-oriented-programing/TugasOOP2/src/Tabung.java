public class Tabung {

    float r;
    int t;

    public Tabung(float r, int t) {
        this.r = r;
        this.t = t;
    }

    // Method untuk mengitung volume Tabung
    public float hitungvolume_Tabung(){
        float l = (float) (3.14 * (this.r * this.r));
        return (l * this.t);
    }
}
