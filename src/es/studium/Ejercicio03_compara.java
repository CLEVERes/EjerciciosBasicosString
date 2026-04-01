package es.studium;

import java.util.Scanner;

/*
3. Compara - Realizar un programa que compare dos cadenas dadas por
teclado. Se nos mostrará un mensaje indicando cuál de las dos es mayor o si
son iguales, con respecto a su longitud.
 */

public class Ejercicio03_compara
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		String[] cadena = new String[2];

		for (int i = 0; i < 2; i++)
		{
			System.out.println("Dime el nombre de la cadena numero [" + (i + 1) + "]");
			cadena[i] = teclado.nextLine();
		}

		if (cadena[0].length() > cadena[1].length())
		{
			System.out.println(cadena[0] + " tiene mas caracteres que " + cadena[1]);
		}

		else if (cadena[0].length() < cadena[1].length())
		{
			System.out.println(cadena[1] + " tiene mas caracteres que " + cadena[0]);
		}

		else
		{
			System.out.println("Tienen la misma cantidad de caracteres");
		}
	}

}
