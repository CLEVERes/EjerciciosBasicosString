package es.studium;

import java.util.Scanner;

/*
 * 14. Copiar - Realizar un programa que copie una cadena leída por teclado en
otra.
 */

public class Ejercicio14_copiar
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		String otroTxt = txt;

		System.out.println(otroTxt);
	}
}