package Tugas;
	
public class Harimau extends Hewan {

	    public Harimau(String nama, int berat) {
	        super(nama, berat);
	    }

	    @Override
	    public int kebutuhanMakan() {
	        return berat * 10 / 100; // 10% dari berat badan
	    }

}
