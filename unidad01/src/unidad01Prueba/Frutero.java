package unidad01Prueba;

import java.util.Scanner;

public class Frutero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		final double PRECIO_KG_MANZANAS = 2.35;
		final double PRECIO_KG_PERAS = 1.95;

		System.out.println("Introduce las ventas en KG de manzanas del primer semestre");

		double ventasManzanas1 = teclado.nextDouble() * PRECIO_KG_MANZANAS * 6;
		System.out.println("Introduce las ventas en KG de peras del primer semestre");
		double ventasPeras1 = teclado.nextDouble() * PRECIO_KG_PERAS * 6;

		System.out.println("Introduce las ventas en KG de manzanas del segundo semestre");

		double ventasManzanas2 = teclado.nextDouble() * PRECIO_KG_MANZANAS * 6;
		System.out.println("Introduce las ventas en KG de peras del segundo semestre");
		double ventasPeras2 = teclado.nextDouble() * PRECIO_KG_PERAS * 6;

		double precioFinal = ventasManzanas1 + ventasManzanas2 + ventasPeras1 + ventasPeras2;

		System.out.println("Los beneficios son: " + precioFinal+ " €");

		teclado.close();
	}

}
