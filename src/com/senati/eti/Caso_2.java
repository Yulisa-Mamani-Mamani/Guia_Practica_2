package com.senati.eti;

import java.util.Scanner;

public class Caso_2 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		String estado = "Número es inpar";
		
		if (n % 2 == 0)
			estado = "Número es par";
		
		System.out.println("----- R E S U L T A D  O -----");
		System.out.println("Estado: " + estado);

	}

}
