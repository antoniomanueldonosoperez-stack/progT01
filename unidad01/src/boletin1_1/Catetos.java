package boletin1_1;

import java.util.Scanner;

public class Catetos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer cateto");
		double cateto1 = teclado.nextDouble();
		System.out.println("Introduzca el segundo cateto");
		double cateto2 = teclado.nextDouble();

		double resultado = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		System.out.printf("el resultado es %.3f \n", resultado);

		teclado.close();
	}

}
