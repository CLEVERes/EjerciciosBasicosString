package es.studium;

import java.util.Scanner;

/*
 * 17. Quitar espacios del principio - Realizar un programa que lea una cadena y
quite los espacios que puedan existir al principio de la cadena.
 */
public class Ejercicio17_quitarEspaciosPrincipio
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		boolean encontrado = false;

		String cadena = "";
		for (int i = 0; i < txt.length(); i++)
		{
			if (txt.toLowerCase().charAt(i) != ' ')
			{
				encontrado = true;
			}

			if (encontrado)
			{
				cadena += txt.charAt(i);
			}

		}

		System.out.println("La cadena sin espacios al principio es: \n" + cadena);
	}
}