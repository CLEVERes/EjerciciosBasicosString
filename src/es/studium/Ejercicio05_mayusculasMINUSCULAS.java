package es.studium;

import java.util.Scanner;

/*
5. Mayúsculas – Minúsculas - Realizar un programa que lea una cadena con
letras mayúsculas y minúsculas intercaladas y la muestre todo en
mayúsculas y todo en minúsculas. 
*/

public class Ejercicio05_mayusculasMINUSCULAS
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Introduce una palabra");
		String palabra = teclado.nextLine();
		System.out.println(palabra.toUpperCase());
		System.out.println(palabra.toLowerCase());
	}
}