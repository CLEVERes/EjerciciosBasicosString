package es.studium;

import java.util.Scanner;

/*
 * 9. Subcadena - Realizar un programa que lea una cadena, una posición y una
longitud y mediante una función obtengamos la subcadena que empieza en
la posición dada y tiene longitud caracteres de la cadena original.
 */
public class Ejercicio09_subCadena
{
	public static Scanner teclado = new Scanner(System.in);

	public static String subCadena(String txt, int pos1, int pos2)
	{
		String subcadena = "";

		for (int i = pos1; i < (pos1 + pos2); i++)
		{
			subcadena += txt.charAt(i);
		}

		return subcadena;
	}

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		System.out.println("Escriba una posicion inicial");
		int pos1 = teclado.nextInt();
		System.out.println("Escriba cuantos caracteres tendra la subCadena");
		int pos2 = teclado.nextInt();
		System.out.println("La subCadena es: " + subCadena(txt, pos1, pos2));
	}

}
