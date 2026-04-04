package es.studium;

import java.util.Scanner;

/*
 * 26. Encriptar - Realizar un programa que lea una cadena y la encripte
cambiando una letra por la que le sigue en el abecedario. La ‘z’ cambiarla por
la ‘a’.
 */
public class Ejercicio26_Encriptar
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();

		String letras = "abcdefghijklmnopqrstuvwxyz";
		String encriptada = "";

		for (int i = 0; i < txt.length(); i++)
		{
			for (int j = 0; j < letras.length(); j++)
			{
				if (txt.charAt(i) == letras.charAt(j))
				{
					if (letras.charAt(j) == 'z')
					{
						encriptada += "a";
					} 
					
					else
					{
						encriptada += letras.charAt(j + 1);
					}
				}
			}

		}
		System.out.println(encriptada);
	}

}
