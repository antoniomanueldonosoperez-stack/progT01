package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva113 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el primer numero");
		int num1 = teclado.nextInt();
		System.out.println("introduce el segundo numero");
		int num2 = teclado.nextInt();
		int resultado;
		System.out.println("Introduce el operador");
		String caracter = teclado.next();
		switch (caracter) {
		case "-":
			resultado = num1 - num2;
			System.out.printf("el resultado es %d \n", resultado);
			break;
		case "+":
			resultado = num1 + num2;
			System.out.printf("el resultado es %d \n", resultado);
			break;
		case "*":
			resultado = num1 * num2;
			System.out.printf("el resultado es %d \n", resultado);
			break;
		case "/":
			resultado = num1 / num2;
			System.out.printf("el resultado es %d \n", resultado);
			break;
		default:
			System.out.println("ERROR: Este valor no esta incluido");
		}

		teclado.close();
	}

}
