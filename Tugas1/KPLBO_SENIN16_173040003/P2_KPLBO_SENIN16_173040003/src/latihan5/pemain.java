package latihan5;

public class pemain {
	private String nama;
	private int noPunggung;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNoPunggung() {
		return noPunggung;
	}
	public void setNoPunggung(int noPunggung) {
		this.noPunggung = noPunggung;
	}
	public pemain() {
		nama = "";
		noPunggung = 0;
	}
	public String toString() {
		return noPunggung+" "+nama;
	}
	public pemain(String nama){
		nama ="";
	}
	public pemain(int noPunggung, String nama) {
		nama = "";
		noPunggung = 0;
	}
}
