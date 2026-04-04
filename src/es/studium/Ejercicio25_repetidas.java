package es.studium;

import java.util.Scanner;

/*
 * 25. Repetidas - Realizar un programa que lea una cadena por teclado y cambie
las letras repetidas contiguas por un *.
 */
public class Ejercicio25_repetidas
{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		
		String cadena = "";
		char repetida = ' ';
		for (int i = 0; i < txt.length(); i++)
		{
			if(i == 0)
			{
				cadena += txt.charAt(i);
			}
			
			else if (txt.charAt(i) == repetida)
			{
				cadena += "*";
			} 
			
			else
			{
				cadena += txt.charAt(i);
			}
			repetida = txt.charAt(i);
		}
		System.out.println(cadena);
	}
}