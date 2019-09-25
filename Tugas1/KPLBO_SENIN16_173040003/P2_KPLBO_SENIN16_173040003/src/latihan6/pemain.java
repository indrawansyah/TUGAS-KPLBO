package latihan6;

public class pemain {
	private String nama;
	private int noPunggung;
	private int gaji;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNomorPunggung() {
		return noPunggung;
	}
	public void setNomorPunggung(int nomorPunggung) {
		this.noPunggung = noPunggung;
	}
	public int getGaji() {
		return gaji;
	}
	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
	public pemain() {
		nama = "";
		noPunggung = 0;
	}
	public String toString() {
		return noPunggung+ ", "+nama + 
	"\nGaji Per Minggu :"+gaji+
	"\nGaji Per Bulan :"+hitungGajiperBulan();
	}
	public pemain(String nama) {
		nama = "";
	}
	public pemain(int noPunggung, String nama) {
		nama = "";
		noPunggung = 0;
	}
	public pemain(int noPunggung, String nama, int gaji) {
		this.nama = nama;
		this.noPunggung = noPunggung ;
		this.gaji = gaji ;
	}
	public int hitungGajiperBulan() {
		return gaji*4;
	}
}
