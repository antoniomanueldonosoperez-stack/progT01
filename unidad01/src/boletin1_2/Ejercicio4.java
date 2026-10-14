package boletin1_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		final double tipoA = 0.20;
		final double tipoB = 0.30;
		final double tipoB2 = 0.50;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el precio inicial");
		double precioInicial = teclado.nextDouble();

		System.out.println("Introduce los kilos de uva");
		double kilos = teclado.nextDouble();

		double precioFinal = 0;
		double total;

		System.out.println("Introduce el tipo (A o B)");
		String tipo = teclado.next().toUpperCase();

		System.out.println("Introduce el tamaño (1 o 2)");
		int tamaño = teclado.nextInt();

		if (tipo.equals("A") && tamaño == 1) {
			precioFinal = precioInicial + tipoA;

		} else if (tipo.equals("A") && tamaño == 2) {
			precioFinal = precioInicial + tipoB;

		} else if (tipo.equals("B") && tamaño == 1) {
			precioFinal = precioInicial - tipoB;

		} else if (tipo.equals("B") && tamaño == 2) {
			precioFinal = precioInicial - tipoB2;

		} else {
			System.out.println("El tipo o el tamaño introducido no es válido.");
			teclado.close();
			return;
		}

		total = precioFinal * kilos;

		System.out.printf("El precio final por kilo es %.2f €%n", precioFinal);
		System.out.printf("El importe total del embarque es %.2f €%n", total);

		teclado.close();
	}
}