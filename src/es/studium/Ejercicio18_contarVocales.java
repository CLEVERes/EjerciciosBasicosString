package es.studium;

import java.util.Scanner;

/*
 * 18. Contar vocales - Realizar un programa que lea una cadena por teclado y
mediante una función cuente el número de vocales.
 */

public class Ejercicio18_contarVocales
{
	public static Scanner teclado = new Scanner(System.in);

	public static int contarVocales(String txt)
	{
		String vocales = "aeiou";
		int contador = 0;
		for (int i = 0; i < txt.length(); i++)
		{
			for (int j = 0; j < vocales.length(); j++)
			{
				if (txt.charAt(i) == vocales.charAt(j))
				{
					contador++;
				}
			}

		}
		return contador;
	}

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();

		System.out.println("Tu palabra tiene " + contarVocales(txt) + " vocales");
	}

}
