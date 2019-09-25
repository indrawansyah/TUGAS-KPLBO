package latihan5;

public class TimMain {
	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		
		Pemain pemain = new Pemain("I Made", 1);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Atep", 7);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Essien", 5);
		tim.tambahPemainInti(pemain);
		
		tim.tambahPemainInti(new Pemain("messi", 22));
		tim.tambahPemainInti(new Pemain("ronaldo", 21));
		tim.tambahPemainInti(new Pemain("benzema", 12));		
		tim.tambahPemainInti(new Pemain("bale", 15));		
		tim.tambahPemainInti(new Pemain("aguero", 65));		
		tim.tambahPemainInti(new Pemain("suarez", 13));		
		tim.tambahPemainInti(new Pemain("grizman", 16));		
		tim.tambahPemainInti(new Pemain("neymar", 15));		
		tim.tambahPemainInti(new Pemain("ozil", 23));		
		tim.tambahPemainInti(new Pemain("robben", 5));	
		tim.tambahPemainInti(new Pemain("puyol", 4));
		
		tim.tampilPemainInti();
		tim.tambahPemainCadangan(new Pemain("beckham", 99));		
		tim.tambahPemainCadangan(new Pemain("ibrahim", 90));		
		tim.tambahPemainCadangan(new Pemain("ribery", 78));
		tim.tampilPemainCadangan();
	}
}
