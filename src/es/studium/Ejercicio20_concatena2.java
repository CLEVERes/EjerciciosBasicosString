package es.studium;

import java.util.Scanner;

/*
 * 20. Concatena2 - Realizar un programa que lea dos cadenas y las concatene
dejando un espacio entre las dos.
 */

public class Ejercicio20_concatena2
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
		
		System.out.println(palabra[0] + " " + palabra[1]);
	}

}
