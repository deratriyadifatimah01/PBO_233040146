package Tugas;

public abstract class Hewan {
	
	 protected String nama;
	    protected int berat;

	    public Hewan(String nama, int berat) {
	        this.nama = nama;
	        this.berat = berat;
	    }

	    public abstract int kebutuhanMakan(); // kg per hari

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public int getBerat() {
	        return berat;
	    }

	    public void setBerat(int berat) {
	        this.berat = berat;
	    }

}
