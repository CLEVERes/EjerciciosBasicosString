package es.studium;

import java.util.Scanner;

/*
1. Nombres - Realizar un programa que lea 5 nombres y los muestre por
pantalla.
*/

public class Ejercicio01_nombres
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{

		String[] nombre = new String[5];

		for (int i = 0; i < 5; i++)
		{
			System.out.println("Dime el nombre de la persona numero [" + (i + 1) + "]");
			nombre[i] = teclado.nextLine();
		}

		System.out.print("\nLos nombres que me has dicho son: ");
		for (int i = 0; i < 5; i++)
		{
			if (i == 4)
			{
				System.out.print("y '" + nombre[i] + "'");
			}

			else
			{
				System.out.print("'" + nombre[i] + "', ");
			}
		}
	}
}
