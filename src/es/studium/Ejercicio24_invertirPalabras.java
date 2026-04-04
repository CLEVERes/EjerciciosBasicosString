package es.studium;

import java.util.Scanner;

/*
 * 24. Invertir palabras - Realizar un programa que lea cadenas por teclado y las
muestre invertidas hasta introducir la palabra “Salir”.
 */

public class Ejercicio24_invertirPalabras
{
	public static Scanner teclado = new Scanner(System.in);

	public static String inversa(String txt)
	{
		String inversa = "";
		for (int i = txt.length() - 1; i >= 0; i--)
		{
			inversa += txt.charAt(i);
		}
		return inversa;
	}

	public static void main(String[] args)
	{
		boolean salir = false;
		do
		{
			System.out.println("Escriba Un texto, escriba \"SALIR\" para finalizar el programa");
			String txt = teclado.nextLine();
			if (txt.toLowerCase().equals("salir"))
			{
				salir = true;
				System.out.println("Fin del programa");
			} 
			
			else
			{
				System.out.println(inversa(txt));
			}
		} while (!salir);
	}
}