package es.studium;

import java.util.Scanner;

/*
 * 12. Mayor - Realizar un programa que lea 5 cadenas y nos diga cuál es la mayor
de ellas alfabéticamente.

 */

public class Ejercicio12_mayor
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		String[] palabra = new String[5];
		int mayor = 0;

		for (int i = 0; i < palabra.length; i++)
		{
			System.out.println("Dime la palabra numero [" + (i + 1) + "]");
			palabra[i] = teclado.nextLine();
			if (palabra[i].compareTo(palabra[mayor]) > 0)
			{
				mayor = i;
			}
		}
		System.out.println("La palabra mayor es: " + palabra[mayor]);
	}
}
