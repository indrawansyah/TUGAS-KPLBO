package Latihan2;
import java.util.Scanner;
public class PersegiPanjang {
	Scanner sc = new Scanner(System.in);
	double panjang ;
	double lebar ;
	double luas ;
	double keliling;
	public double hitungluas () {
		luas = panjang * lebar;
		return luas;
	}
	public double hitungkeliling () {
		keliling = 2 * (panjang * lebar);
		return keliling;
	}
	public void tampil() {
		System.out.println("panjang  :" + panjang);
		System.out.println("Lebar    :" + lebar);	
		System.out.println("Luas     :" + luas);
		System.out.println("Keliling :" + keliling);
	}
	public void input () {
		System.out.println("Masukan Nilai Panjang  :");
		panjang = sc.nextInt();
		System.out.println("Masukan Nilai Lebar   :");
		lebar = sc.nextInt();
	}
	public static void main(String[] args) {
		PersegiPanjang p = new PersegiPanjang();
		p.input();
		p.hitungluas();
		p.hitungkeliling();
		p.tampil();
	}
}
