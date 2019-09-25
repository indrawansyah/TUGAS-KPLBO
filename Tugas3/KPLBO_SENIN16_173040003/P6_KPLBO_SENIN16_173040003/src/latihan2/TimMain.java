package latihan2;

public class TimMain {
	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		
		Pemain pemain = new Pemain("I Made", 1);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Atep", 7);
		tim.tambahPemainInti(pemain);
		
		pemain = new Pemain("Essien", 5);
		tim.tambahPemainInti(pemain);
		tim.tambahPemainInti(new Pemain("Ronaldo", 22));
		tim.tambahPemainInti(new Pemain("Messi", 21));
		tim.tambahPemainInti(new Pemain("Dybala", 12));
		tim.tambahPemainInti(new Pemain("Aguero", 15));
		tim.tambahPemainInti(new Pemain("Suarez", 65));
		tim.tambahPemainInti(new Pemain("Grizman", 13));
		tim.tambahPemainInti(new Pemain("Pogba", 16));
		tim.tambahPemainInti(new Pemain("Sances", 15));
		tim.tambahPemainInti(new Pemain("Neymar", 23));
		tim.tambahPemainInti(new Pemain("Ozil", 5));
		tim.tambahPemainInti(new Pemain("Robben", 4));
		
		tim.tampilPemainInti();
	}
}
