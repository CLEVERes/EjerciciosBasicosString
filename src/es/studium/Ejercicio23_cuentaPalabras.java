package es.studium;

import java.util.Scanner;

/*
 * 23. Cuenta Palabras - Realizar un programa que lea una cadena por teclado y
mediante una función cuente el número de palabras que hay en dicha
cadena.
 */
public class Ejercicio23_cuentaPalabras
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		int contadorPalabras = 0;

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
			contadorPalabras++;
			System.out.println(p);
		}
		System.out.println("El numero de palabras es: " + contadorPalabras);
	}
}