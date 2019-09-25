package latihan6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tim {
private String nama;
private List<Pemain> pemainInti =new ArrayList<Pemain>();
private List<Pemain> cadangan =new ArrayList<Pemain>();
private List<Pemain> gatiPemain =new ArrayList<Pemain>();

public Tim() {
	nama="";
}
public Tim(String nama) {
	this.nama=nama;
}
public boolean tambahPemainInti(Pemain pemain) {
	if (pemainInti.size()<11) {
		pemainInti.add(pemain);
		System.out.println(pemain.getNama()+ "berhasil ditabahkan sebagai pemain utama");
		return true;
	}
	else {
		System.out.println(pemain.getNama()+"Tidak berhasil ditamabah sebagai pemain");
		return false;
	}
}
public boolean pemaincadangan(Pemain pemain) {
	if (cadangan.size()<6) {
		cadangan.add(pemain);
		System.out.println(pemain.getNama()+ "pemain cadangan berhasil ditambah");
		return true;
	}
	else {
		System.out.println(pemain.getNama()+"Tidak berhasil ditamabah sebagai cadanagn");
		return false;
	}
}
public void tampilPemainInti() {
	Collections.sort(pemainInti);
	for(int i=0; i < pemainInti.size(); i++) {
		Pemain p = pemainInti.get(i);
		System.out.println(p.getNoPunggung()+" # "+p.getNama());
	}
}

public void tampilpemaincadangan() {
	Collections.sort(cadangan);
	for(int i=0; i < cadangan.size(); i++) {
		Pemain p = cadangan.get(i);
		System.out.println(p.getNoPunggung()+" # "+p.getNama());
	}
}
public void pemainGanti(int pemainGanti, int pemainMain) {
	Pemain pm = cadangan.get(pemainMain);
	Pemain pg = pemainInti.get(pemainGanti);
	System.out.println(pm.getNama()+" no punggung "+pm.getNoPunggung()+
	" masuk  mengganti " + pg.getNama()+" no punggung "+pg.getNoPunggung());
	pemainInti.remove(pemainGanti);
	cadangan.remove(pemainMain);
	pemainInti.add(pm);
}
}
