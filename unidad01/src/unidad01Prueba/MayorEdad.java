package unidad01Prueba;

import java.util.Scanner;

public class MayorEdad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca su edad");
		int edad = teclado.nextInt();
		boolean mayorEdad = edad >= 18;
		System.out.println("Mayor edad: " + mayorEdad);

		teclado.close();
	}

}
