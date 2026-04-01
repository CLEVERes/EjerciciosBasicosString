package es.studium;

import java.util.Scanner;

/*
7. Longitud - Realizar un programa que lea una frase por teclado e indique
mediante una función, la longitud de esta, incluidos los espacios y sin incluir.
*/
public class Ejercicio07_longitud
{
	public static Scanner teclado = new Scanner(System.in);

	public static int contadorCon(String p)
	{
		int r = 0;
		for (int i = 0; i < p.length(); i++)
		{
			r++;
		}
		return r;
	}

	public static int contadorSin(String p)
	{
		int r = 0;

		for (int i = 0; i < p.length(); i++)
		{
			if (p.charAt(i) != ' ')
			{
				r++;
			}
		}
		return r;
	}

	public static void main(String[] args)
	{
		System.out.println("Escribe un texto");
		String palabra = teclado.nextLine();

		System.out.println("Hay un total de " + contadorCon(palabra) + " caracteres contando los espacios");
		System.out.println("Hay un total de " + contadorSin(palabra) + " caracteres sin contar los espacios");
	}

}
