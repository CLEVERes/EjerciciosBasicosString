package es.studium;

/*
2. Recorre – Realizar un programa que, dada una cadena con todo el
abecedario de la A a la Z en mayúsculas, la recorra y muestre una a una las
letras que la componen.
*/

public class Ejercicio02_recorre
{
	public static void main(String[] args)
	{
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";

		for (int i = 0; i < abecedario.length(); i++)
		{
			System.out.println(abecedario.charAt(i));
		}
	}
}