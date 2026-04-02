package es.studium;

import java.util.Scanner;

/*
 * 16. Quitar espacios - Realizar un programa que lea una cadena por teclado y
obtenga la misma cadena, pero sin espacios.
 */
public class Ejercicio16_quitarEspacios
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();

		String cadena = "";
		for (int i = 0; i < txt.length(); i++)
		{
			if (txt.toLowerCase().charAt(i) != ' ')
			{
				cadena += txt.charAt(i);
			}
		}

		System.out.println("La cadena sin espacios es: \n" + cadena);
	}
}