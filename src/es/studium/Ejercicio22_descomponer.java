package es.studium;

import java.util.Scanner;

/*
 * 22. Descomponer - Realizar un programa que lea una cadena y la descomponga
en palabras mostrando cada una en una línea diferente.
 */
public class Ejercicio22_descomponer
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();

		/*
		 * for(int i = 0; i < txt.length(); i++) { if(txt.charAt(i) == ' ') {
		 * System.out.println(); } else { System.out.print(txt.charAt(i)); }
		 * 
		 * }
		 */

		String[] palabras = txt.trim().split("\\s+");

		System.out.println("\nPalabras descompuestas:");
		for (String p : palabras)
		{
			System.out.println(p);
		}
	}
}