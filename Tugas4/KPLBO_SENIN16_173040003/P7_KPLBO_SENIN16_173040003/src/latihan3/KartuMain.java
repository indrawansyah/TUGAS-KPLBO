package latihan3;

public class KartuMain {

	public static void main(String[] args) {
		Kartu kartu1 = new KartuATM("222", "123");
		Kartu kartu3 = new KartuKredit("333", "457");

		System.out.println("Kartu 1 : " + kartu1.otentikasi("123"));
		System.out.println("Kartu 1 : " + kartu1.otentikasi("237"));

		System.out.println("Kartu 3 : " + kartu3.otentikasi("745"));
		System.out.println("Kartu 3 : " + kartu3.otentikasi("444"));
	}

}
