package es.studium;

import java.util.Scanner;

/*
4. Concatena - Realizar un programa que lea dos cadenas y las concatene en
una tercera cadena que mostrará por pantalla.
*/

public class Ejercicio04_concatena
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		String[] palabra = new String[2];

		for (int i = 0; i < 2; i++)
		{
			System.out.println("Dime la palabra numero [" + (i + 1) + "]");
			palabra[i] = teclado.nextLine();
		}

		System.out.println("El resultado de unir la palabra \"" + palabra[0] + "\" con la palabra \"" + palabra[1]
				+ "\" es: \"" + palabra[0] + " " + palabra[1] + "\"");
	}
}