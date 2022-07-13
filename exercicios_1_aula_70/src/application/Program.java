package application;

import java.util.Locale;
import java.util.Scanner;

import entiti.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter rectangle with and height: ");
		product.width = sc.nextDouble();
		product.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n",product.Area());
		System.out.printf("PERIMETER = %.2f%n",product.perimeter());
		System.out.printf("DIAGONAL = %.2f%n",product.diagonal());
		
		
		
		
		
		sc.close();

	}

}
