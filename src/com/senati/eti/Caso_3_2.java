package com.senati.eti;

import java.util.Scanner;

public class Caso_3_2 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 3: ");
		int n3 = sc.nextInt();
		
		
		String mensaje = "";
		
		//Anidada
		if (n1 == n2 && n1 == n3)
			mensaje = "Los n�meros son iguales";
		else if (n1 > n2 && n1 > n3) 
			mensaje = "El primer n�mero" + " " + n1 + " " + "es mayor";
		else if (n2 > n1 && n2 > n3) 
			mensaje = "El segundo n�mero" + " " + n2 + " " + "es mayor";
		else 
			mensaje = "El tercer n�mero" + " " + n3 + " " + "es mayor";
		
		System.out.println("\n---------- R E S U L T A D O ----------");
		System.out.println("Mensaje: " + mensaje);

	}

}
