package es.studium;

import java.util.Scanner;

/*
 * 21. Inversa - Realizar un programa que lea una cadena y mediante una función,
devuelva la inversa de esta.
 */

public class Ejercicio21_inversa
{
	public static Scanner teclado = new Scanner(System.in);

	public static String inversa(String txt)
	{
		String inversa = "";
		for (int i = txt.length() - 1; i >= 0; i--)
		{
			inversa += txt.charAt(i);
		}
		return inversa;
	}

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		System.out.println(inversa(txt));
	}

}
