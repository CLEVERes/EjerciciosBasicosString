package es.studium;

import java.util.Scanner;

/*
13. Cambiar a por o - Realizar un programa que lea una cadena y cambie todas
las vocales ‘a’ por vocales ‘o’
*/

public class Ejercicio13_cambiarAporO
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		
		/*
		String cadena = "";
		for (int i = 0; i < txt.length(); i++)
		{
			if (txt.charAt(i) == 'a')
			{
				cadena += 'o';
			}
			else
			{
				cadena += txt.charAt(i);
			}
		}
		*/
		
		String cadena = txt.replace('a', 'o');
		
		System.out.println("Este es el resultado de cambiar las \"a\" por \"o\": \n" +  cadena);
	}
}