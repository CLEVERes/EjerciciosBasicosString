package es.studium;

import java.util.Scanner;

/*
6. Igualdad - Realizar un programa que lea dos cadenas por teclado y nos diga
si son iguales o no. 
*/

public class Ejercicio06_igualdad
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

		if (palabra[0].equals(palabra[1]))
		{
			System.out.println("Son iguales");
		} else
		{
			System.out.println("Son Distintas");
		}
	}
}