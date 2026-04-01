package es.studium;

import java.util.Scanner;

/*
 * 10. Subcadena2 – Realizar un programa que obtenga la parte derecha de una
cadena de caracteres indicando la cadena y un valor numérico entero que
nos dirá cuántos caracteres debemos obtener desde el final de la cadena.
 */
public class Ejercicio10_subCadena2
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		String subcadena = "";
		System.out.println("Escriba un texto");
		String txt = teclado.nextLine();
		System.out.println("Indica cuantos caracteres tomar");
		int cantidad = teclado.nextInt();
		for (int i = (txt.length() - cantidad); i < txt.length(); i++)
		{
			subcadena += txt.charAt(i);
		}

		System.out.println(subcadena);
	}
}