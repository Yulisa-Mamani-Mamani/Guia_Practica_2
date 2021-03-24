package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_9 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Ingrese nombre del(a) alumno(a).......: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese nota 1........................: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese nota 2........................: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese números de asistencias [1-12].: ");
		float asistencia = sc.nextFloat();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float pa = asistencia / 12 * 100; //porcentaje de asistencias
		
		String estado = "Desaprobado";
		
		if (promedio >= 13 && pa >= 70) 
			estado = "Aprobado";
		
		
		System.out.println("\n------- R E S U L T A D O -------");
		System.out.println("Alumno.............: " + nombre.toUpperCase());//toUpperCase es para que el 
		                                                                   //nombre que pogas sea en 
		                                                                   //mayúsculas
		System.out.println("Promedio...........: " + df.format(promedio));
		System.out.println("Asistencia.........: " + df.format(pa) + "%");
		System.out.println("Estado.............: " + estado);
		

	}

}
