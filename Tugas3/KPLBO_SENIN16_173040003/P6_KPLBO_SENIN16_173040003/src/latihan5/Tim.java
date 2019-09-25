package latihan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tim {
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	private List<Pemain> pemainCadangan = new ArrayList<Pemain>();
	private int noPunggung;
	
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}
	
	public boolean tambahPemainInti(Pemain pemain) {
		if(pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama()+ " Berhasil ditambahkan sebagai pemain utama. ");
			return true;
		}else {
			System.out.println(pemain.getNama()+ " Tidak berhasil ditambahkan sebagai pemain utama.");
			return false;
		}
	}
	
	public boolean tambahPemainCadangan(Pemain pemain) {
		if(pemainCadangan.size() < 7) {
			pemainCadangan.add(pemain);
			System.out.println(pemain.getNama()+ " Berhasil ditambahkan sebagai pemain cadangan");
			return true;
		}else {
			System.out.println(pemain.getNama()+ " Tidak berhasil ditambahkan sebagai pemain cadangan");
			return false;
		}
	}
	
	public void tampilPemainInti() {
		Collections.sort(pemainInti);
		for(int i = 0; i < pemainInti.size(); i++) {
			Pemain p = pemainInti.get(i);
			System.out.println(p.getNoPunggung()+" # "+ p.getNama());
		}
	}
	
	public void tampilPemainCadangan() {
		Collections.sort(pemainCadangan);
		for(int i = 0; i < pemainCadangan.size(); i++) {
			Pemain p = pemainCadangan.get(i);
			System.out.println(p.getNoPunggung()+" # "+ p.getNama());
		}
	}
}
