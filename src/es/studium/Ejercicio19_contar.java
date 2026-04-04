package es.studium;

import java.util.Scanner;

/*
 * 19. Contar - Realizar un programa que lea un texto y calcule el número de letras
y de dígitos encontrados en él. El resultado lo mostrará por pantalla.
 */
public class Ejercicio19_contar
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		int contadorNumeros = 0;
		int contadorLetras = 0;
		for (int i = 0; i < txt.length(); i++)
		{
			char elemento = txt.charAt(i);

			if (Character.isLetter(elemento))
			{
				contadorLetras++;
			}

			else if (Character.isDigit(elemento))
			{
				contadorNumeros++;
			}
		}
		System.out.println(
				"Hay un total de " + contadorLetras + " letras en tu texto y " + contadorNumeros + " digitos.");
	}
}