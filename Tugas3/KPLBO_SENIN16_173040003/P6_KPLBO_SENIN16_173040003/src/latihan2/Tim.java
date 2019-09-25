package latihan2;

import java.util.ArrayList;
import java.util.List;

public class Tim {
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}

	public void tampilPemainInti() {
		for(int i = 0; i < pemainInti.size(); i++) {
			Pemain p = pemainInti.get(i);
			System.out.println(p.getNoPunggung()+" # "+ p.getNama());
		}
	}
	public boolean tambahPemainInti(Pemain pemain) {
		if(pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama()+ " Berhasil Ditambahkan Sebagai Pemain Utama. ");
			return true;
		}else {
			System.out.println(pemain.getNama()+ " Tidak Berhasil Ditambahkan Sebagai Pemain Utama.");
			return false;
		}
	}
}
