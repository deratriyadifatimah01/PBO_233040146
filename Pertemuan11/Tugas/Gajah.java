package Tugas;
	
public class Gajah extends Hewan {

	    public Gajah(String nama, int berat) {
	        super(nama, berat);
	    }

	    @Override
	    public int kebutuhanMakan() {
	        return berat * 5 / 100; // 5% dari berat badan
	    }

}
