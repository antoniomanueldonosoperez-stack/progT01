package unidad01Prueba;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		boolean esPar = num % 2 == 0;
		System.out.println("Es par : " + esPar);

		teclado.close();
	}

}
