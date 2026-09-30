package unidad01Prueba;

import java.util.Scanner;

public class EdadLaboral {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca su edad");
		int edad = teclado.nextInt();
		boolean edadLaboral = edad >= 16 && edad < 67;

		System.out.println("Esta en edad laboral: " + edadLaboral);

		teclado.close();
	}

}
