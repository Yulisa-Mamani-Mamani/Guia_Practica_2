package com.senati.eti;

import java.util.Scanner;

public class Caso_5 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		float total = precio * cantidad;
		
		float dsct = 0;
		
		if (cantidad > 8) dsct = (float) 0.1 * total; //aplicar CAST
		
		
		//float neto = total - dsct; si lo ponemos así  
		//tenemos que ponerlo en la impresión 
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Total...........: " + total);
		System.out.println("Descuento.......: " + dsct);
		System.out.println("Neto: " + (total - dsct));//en vez de esto poner neto
		                                              //siempre en cuando lo hagamos
		                                              //como arriba
		

	}

}
