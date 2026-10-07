package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva96 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		String mensaje = "El numero es impar";
		if (num % 2 == 0) {

			mensaje=("El numero es par");
		}
		
		System.out.println(mensaje);

		teclado.close();
	}

}
