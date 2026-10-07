package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva99 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer numero");
		int num1 = teclado.nextInt();
		System.out.println("Introduzca el primer numero");
		int num2 = teclado.nextInt();
		
		if (num1==num2) {
			System.out.println("Ambos numeros son iguales");
		}else {
			System.out.println("Los numeros son distintos");
		}

		teclado.close();
	}

}
