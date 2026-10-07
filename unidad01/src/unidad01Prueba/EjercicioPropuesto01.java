package unidad01Prueba;

import java.util.Scanner;

public class EjercicioPropuesto01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer numero entero");
		int num1 = teclado.nextInt();
		System.out.println("Introduzca el primer numero entero");
		int num2 = teclado.nextInt();

		if (num1 != num2 || num1 == 0 || num2 == 0) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

		teclado.close();
	}

}
