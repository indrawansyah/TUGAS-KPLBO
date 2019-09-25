package latihan4;

public class Pemain {
	private String nama;
	private int noPunggung;
	private GajiPemain gp = new GajiPemain();
	
	public Pemain() {
		this("");
	}
	public Pemain(String nama) {
		this(nama,0);
	}
	public Pemain(String nama,int noPunggung) {
		this.nama=nama;
		this.noPunggung=noPunggung;
	}
	public Pemain(String nama,int noPunggung, GajiPemain gp) {
		this(nama,noPunggung);
		this.gp=gp;
	}
	public String toString() {
		return noPunggung+ ","+nama+ "\n gaji : " +gp.gaji + "\n bonus menang : "
		+ gp.getBonusMenang()+ "\n bonus gol : " + gp.getBonusGol();
	}
}
