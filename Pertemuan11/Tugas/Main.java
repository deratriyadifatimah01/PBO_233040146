package Tugas;

public class Main {
	
	    public static void main(String[] args) {
	        Hewan gajah = new Gajah("Gajah Sumatra", 3000);
	        Hewan harimau = new Harimau("Harimau Benggala", 200);

	        HewanElektronik chipGajah = new HewanElektronik("GJ123", "s3cr3t");

	        System.out.println("== Data Hewan ==");
	        System.out.println(gajah.getNama() + " -> Makan/hari: " + gajah.kebutuhanMakan() + " kg");
	        System.out.println(harimau.getNama() + " -> Makan/hari: " + harimau.kebutuhanMakan() + " kg");

	        System.out.println("\n== Chip Otentikasi ==");
	        System.out.println("Kode valid: " + chipGajah.autentikasi("s3cr3t"));
	        System.out.println("Kode terenkripsi: " + chipGajah.encode("s3cr3t"));
	    }

}
