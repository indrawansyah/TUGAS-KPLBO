package latihan6;

public class TimMain {
public static void main(String[] args) {
	Tim tim = new Tim("Persib");
	
	Pemain pemain = new Pemain ("I Made ", 1);
	tim.tambahPemainInti(pemain);
	

	pemain = new Pemain ("Atep ", 7);
	tim.tambahPemainInti(pemain);
	
	pemain = new Pemain ("Essien ", 5);
	tim.tambahPemainInti(pemain);
	
	tim.tambahPemainInti(new Pemain ("messi",13));
	tim.tambahPemainInti(new Pemain ("ronaldo",23));
	tim.tambahPemainInti(new Pemain ("benzema",22));
	tim.tambahPemainInti(new Pemain ("Aguero",12));
	tim.tambahPemainInti(new Pemain ("Bale",04));
	tim.tambahPemainInti(new Pemain ("modric",16));
	tim.tambahPemainInti(new Pemain ("Sabil",50));

	tim.tampilPemainInti();
	
	tim.pemaincadangan(new Pemain ("Backham",28));
	tim.pemaincadangan(new Pemain ("neymar",27));
	tim.pemaincadangan(new Pemain ("mbape",10));
	tim.pemaincadangan(new Pemain ("hazzard",55));
	tim.tampilpemaincadangan();
	
	tim.pemainGanti(3, 1);
	
}
}
