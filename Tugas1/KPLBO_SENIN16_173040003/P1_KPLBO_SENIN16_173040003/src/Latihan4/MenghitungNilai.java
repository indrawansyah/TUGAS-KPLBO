package Latihan4;

import java.util.Scanner;

public class MenghitungNilai {
	public static void main(String[] args) {
		int n;
		int total = 0;
		int bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nilai : ");n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			bill = sc.nextInt();
			total = total + bill;
			
		}
		System.out.println("Total = " +total);
	}
}
