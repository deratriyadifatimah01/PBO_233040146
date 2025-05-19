package Latihan1;

public class Lingkaran extends Bentuk {
	
	 /* Konstruktor Lingkaran yang memanggil konstruktor superclass Bentuk
     * dengan parameter jari-jari
     */
    public Lingkaran(int jari2) {
        super(jari2);
    }
    
    /*
     * Method luas di kelas Lingkaran override (ditulis ulang) dan diimplementasikan
     * dengan rumus PHI*r*r
     */
    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }

}
