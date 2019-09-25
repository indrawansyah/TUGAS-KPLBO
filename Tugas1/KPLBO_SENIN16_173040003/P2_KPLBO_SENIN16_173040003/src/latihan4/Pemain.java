package latihan4;

public class Pemain {
	
	private String nama ;
	private String noPunggung;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNoPunggung() {
		return noPunggung;
	}
	public void setNoPunggung(String noPunggung) {
		this.noPunggung = noPunggung;
	}
	public String toString() {
		return nama+ ":" +noPunggung;
	}
	
	public Pemain () {
		nama = "";
		noPunggung = "0";
	}
	
	public Pemain (String nama) {
		this.nama = nama;
	
	}
	public Pemain (String nama, String noPunggung) {
		this.nama = nama;
		this.noPunggung = noPunggung;
		}
	
	
}

