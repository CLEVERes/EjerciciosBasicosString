package es.studium;

import java.util.Scanner;

/*
15. Cambiar a por ha - Realizar un programa que lea una cadena y cambie todas
las vocales ‘a’ por ‘ha’.
*/

public class Ejercicio15_cambiarAporHA
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Escriba Un texto");
		String txt = teclado.nextLine();
		
		
		String cadena = "";
		for (int i = 0; i < txt.length(); i++)
		{
			if (txt.toLowerCase().charAt(i) == 'a')
			{
				cadena += "ha";
			}
			else
			{
				cadena += txt.charAt(i);
			}
		}
		
		
		//String cadena = txt.toLowerCase().replace("a", "ha");
		
		System.out.println("Este es el resultado de cambiar las \"a\" por \"o\": \n" +  cadena);
	}
}