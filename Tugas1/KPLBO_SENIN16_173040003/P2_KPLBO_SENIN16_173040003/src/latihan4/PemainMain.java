package latihan4;

public class PemainMain {
	public static void main(String[] args) {
		
		Pemain p1 = new Pemain();
		p1.setNama("David Saimen");
		p1.setNoPunggung("1");
		System.out.println(p1);
		
		Pemain p2 = new Pemain("Toni Adana");
		p2.setNoPunggung("6");
		System.out.println(p2);
		
		Pemain p3 = new Pemain ("Triery Henry");
		p3.setNoPunggung("11");
		System.out.println(p3);
	}
}
 