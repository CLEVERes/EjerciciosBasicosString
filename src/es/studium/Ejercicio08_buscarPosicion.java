package es.studium;

import java.util.Scanner;

/*
 * 8. Buscar posición- Realizar un programa que lea una frase y un carácter y
muestre la primera posición donde aparece dicho carácter por primera vez.
 */
public class Ejercicio08_buscarPosicion
{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		boolean encontrado = false;
		System.out.println("Escribe un texto");
		String palabra = teclado.nextLine();
		System.out.println("Escribe un caracter");
		char caracter = teclado.nextLine().charAt(0);

		for (int i = 0; i < palabra.length(); i++)
		{
			if (encontrado == false)
			{
				if (palabra.charAt(i) == caracter)
				{
					System.out.println("El caracter \"" + caracter + "\" se encontro en la posicion: " + (i + 1));
					encontrado = true;
				}
			}
		}
	}

}
