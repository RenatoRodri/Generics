package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("How many values ? ");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("first: " + ps.first());
		
		
		
		sc.close();
	}

}
