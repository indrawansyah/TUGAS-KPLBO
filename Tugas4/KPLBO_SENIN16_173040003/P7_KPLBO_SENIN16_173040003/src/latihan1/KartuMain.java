package latihan1;

public class KartuMain {

	public static void main(String[] args) {
		Kartu kartu1 = new KartuATM("222", "123");
		Kartu kartu2 = new KartuATM("333", "345");

		System.out.println("Kartu 1 : " + kartu1.otentikasi("123"));
		System.out.println("Kartu 1 : " + kartu1.otentikasi("123"));
		System.out.println("Kartu 2 : " + kartu1.otentikasi("345"));
		System.out.println("Kartu 2 : " + kartu1.otentikasi("356"));
	}

}
