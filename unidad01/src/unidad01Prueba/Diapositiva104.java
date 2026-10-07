package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva104 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		int num1 = teclado.nextInt();

		System.out.println("Introduce el segundo numero");
		int num2 = teclado.nextInt();

		System.out.println("Introduce el tercero numero");
		int num3 = teclado.nextInt();

		if (num1 >= num2 && num2 >= num3) {
			System.out.printf("El orden es: primero %d, segundo %d, tercero %d%n", num1, num2, num3);

		} else if (num1 >= num3 && num3 >= num2) {
			System.out.printf("El orden es: primero %d, segundo %d, tercero %d%n", num1, num3, num2);

		} else if (num2 >= num1 && num1 >= num3) {
			System.out.printf("El orden es: primero %d, segundo %d, tercero %d%n", num2, num1, num3);

		} else if (num2 >= num3 && num3 >= num1) {
			System.out.printf("El orden es: primero %d, segundo %d, tercero %d%n", num2, num3, num1);

		} else if (num3 >= num1 && num1 >= num2) {
			System.out.printf("El orden es: primero %d, segundo %d, tercero %d%n", num3, num1, num2);

		} else {
			System.out.printf("El orden es: primero %d, segundo %d, tercero %d%n", num3, num2, num1);
		}

		teclado.close();
	}
}
