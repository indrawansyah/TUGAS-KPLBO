package latihan4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tim {
	private String nama;
	private List <Pemain> daftarPemain = new ArrayList<Pemain>();
	
	public Tim () {
		nama = " ";
	}
	
	public Tim (String nama ) {
		this.nama = nama ;
	}
	
	public void tambahPemain (Pemain pemain) {
		daftarPemain.add(pemain);
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Pemain> getDaftarPemain() {
		return daftarPemain;
	}

	public void setDaftarPemain(List<Pemain> daftarPemain) {
		this.daftarPemain = daftarPemain;
	}

	public void tampilPemain() {
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			System.out.println(p.getNoPunggung()+ "# "+p.getNama()+ "# "+p.getGaji());
		}
		System.out.println("Total Gaji PerMinggu :"+hitungTotalGajiPerMinggu());
	}
	
	public int hitungTotalGajiPerMinggu() {
		int total = 0;
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			total = total + p.getGaji();
		}
		return total ;
	}
	public void cekKebugaranPemain() {
		System.out.println("No. | Nama Pemain | Cedera | Kebugaran");
		Iterator<Pemain> it = daftarPemain.iterator();
		while(it.hasNext()) {
			Pemain p = it.next();
			System.out.println(p.getNoPunggung()+ " # "+ p.getNama()+
					" # "+ p.isCedera()+ " # "+p.getKebugaran());
		}
	}

}
