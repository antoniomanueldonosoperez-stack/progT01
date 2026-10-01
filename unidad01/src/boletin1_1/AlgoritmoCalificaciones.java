package boletin1_1;

import java.util.Scanner;

public class AlgoritmoCalificaciones {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca la primera calificación");
		double cali1 = teclado.nextDouble();
		System.out.println("Introduzca la segunda calificación");
		double cali2 = teclado.nextDouble();
		System.out.println("Introduzca la tercera calificación");
		double cali3 = teclado.nextDouble();
		double media = (cali1 + cali2 + cali3) / 3;

		String mensajeResultado = (media >= 5 && (cali1 >= 3 && cali2 >= 3 && cali3 >= 3)) ? "Aprobado" : "Suspenso";
		System.out.println(mensajeResultado);
		teclado.close();

	}

}
