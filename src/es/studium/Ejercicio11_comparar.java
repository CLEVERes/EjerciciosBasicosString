package es.studium;

import java.util.Scanner;

/*
 * 11. Comparar - Realizar un programa que lea dos palabras y nos indique
mediante una función cuál de las dos es mayor alfabéticamente.
 */

public class Ejercicio11_comparar
{
	public static Scanner teclado = new Scanner(System.in);

	public static void comparar(String[] palabra)
	{
		if (palabra[0].compareTo(palabra[1]) > 0)
		{
			System.out.println(palabra[0] + " es mayor que " + palabra[1]);
		}

		else if (palabra[0].compareTo(palabra[1]) < 0)
		{
			System.out.println(palabra[1] + " es mayor que " + palabra[0]);
		}

		else
		{
			System.out.println("son iguales");
		}
	}

	public static void main(String[] args)
	{
		String[] palabra = new String[2];

		for (int i = 0; i < 2; i++)
		{
			System.out.println("Dime la palabra numero [" + (i + 1) + "]");
			palabra[i] = teclado.nextLine();
		}

		comparar(palabra);
	}
}