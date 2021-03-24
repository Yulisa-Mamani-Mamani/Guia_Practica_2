package com.senati.eti;

import java.util.Scanner;

public class Caso_11 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		//estructura múltiple
		System.out.print("Ingrese número [1-7]: ");
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
				nombre_dia = "Miércoles";
				break;
				
			case 4:
				nombre_dia = "Jueves";
				break;
				
			case 5:
				nombre_dia = "Viernes";
				break;
				
			case 6:
				nombre_dia = "Sábado";
				break;
				
			case 7:
				nombre_dia = "Domingo";
				break;
				
			default:
				nombre_dia = "Desconocido";
		}//ALT + 125
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Día de la semana: " + nombre_dia.toUpperCase());

	}

}
