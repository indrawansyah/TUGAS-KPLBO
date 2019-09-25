package Latihan3;

import java.util.Scanner;

public class IndeksNilaiMatkul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nilai;
		
		System.out.println("Masukan Nilai Akhir  :");nilai=sc.nextInt();
		
		if (nilai >=81 && nilai<=100) {
			System.out.println("A");
		}else if (nilai >=76 && nilai <=80) {
			System.out.println("AB");
		}else if (nilai >=56 && nilai <=75) {
			System.out.println("B");
		}else if (nilai >=51 && nilai <=55) {
			System.out.println("BC");
		}else if (nilai >=41 && nilai <=50) {
			System.out.println("C");
		}else if (nilai >=21 && nilai <=40) {
			System.out.println("A");
		}else if (nilai >=1 && nilai <=20) {
			System.out.println("A");
		}
		else {
			System.out.println("Nilai Diluar Jangkauan");
		}
	}
}
