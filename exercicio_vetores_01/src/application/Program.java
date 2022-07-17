package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			
		}
		System.out.println("Quanntos nummeros: "+n);
		
		int numberNegative = 0;
		
		
		System.out.println();
		
		sc.close();
		
	

	}

}
