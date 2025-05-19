package Latihan1;

public abstract class Bentuk {
	
	  // Konstanta PHI digunakan dalam perhitungan luas lingkaran atau tabung
    protected double PHI = 3.14;
    // Variabel jari-jari untuk bentuk geometri
    protected int jari2;

    // Konstruktor kelas Bentuk, menerima parameter jari2
    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    /* Method ini merupakan method abstrak yang terdapat di kelas abstrak Bentuk
     * karena merupakan method tanpa isi yang harus diimplementasikan oleh subclassnya 
     */
    public abstract double luas();

    // Setter & Getter

    // Method getter untuk mengambil nilai jari2
    public int getJari2() {
        return jari2;
    }

    // Method setter untuk mengubah nilai jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

}
