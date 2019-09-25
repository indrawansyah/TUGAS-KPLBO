package Latihan1;

import java.util.Scanner;

public class PersegiPanjang {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int panjang ;
		int lebar;
		
	
		System.out.println("Masukan Nilai Panjang  :");
		panjang = sc.nextInt();
		System.out.println("Masuykan Nilai Lebar   :");
		lebar = sc.nextInt();
		int luas = panjang * lebar;
		int keliling =  2 * (panjang + lebar);
		System.out.println("Lebar   :" + luas);
		keliling = 2 * (panjang * lebar);
		
		System.out.println("Keliling  :" + keliling);
	

	}
}
