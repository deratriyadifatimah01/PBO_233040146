package Tugas;

	
	public class HewanElektronik implements Chip {

	    private String idChip;
	    private String kodeRahasia;

	    public HewanElektronik(String idChip, String kodeRahasia) {
	        this.idChip = idChip;
	        this.kodeRahasia = kodeRahasia;
	    }

	    @Override
	    public boolean autentikasi(String kode) {
	        return kodeRahasia.equals(kode);
	    }

	    @Override
	    public String encode(String kode) {
	        return new StringBuilder(kode).reverse().toString(); // membalik string
	    }

}
