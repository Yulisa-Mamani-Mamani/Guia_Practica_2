package com.senati.eti;

import java.util.Scanner;

public class Caso_11 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		//estructura m�ltiple
		System.out.print("Ingrese n�mero [1-7]: ");
		int nd = sc.nextInt();
		
		String nombre_dia = "";
		
		switch (nd) {//ALT +123
			case 1:
				nombre_dia = "Lunes";
				break;
			
			case 2:
				nombre_dia = "Martes";
				break;
				
			case 3:
				nombre_dia = "Mi�rcoles";
				break;
				
			case 4:
				nombre_dia = "Jueves";
				break;
				
			case 5:
				nombre_dia = "Viernes";
				break;
				
			case 6:
				nombre_dia = "S�bado";
				break;
				
			case 7:
				nombre_dia = "Domingo";
				break;
				
			default:
				nombre_dia = "Desconocido";
		}//ALT + 125
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("D�a de la semana: " + nombre_dia.toUpperCase());

	}

}
