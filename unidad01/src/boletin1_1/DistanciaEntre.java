package boletin1_1;

import java.util.Scanner;

public class DistanciaEntre {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el primer numero");
		double num1 = teclado.nextDouble();
		System.out.println("introduzca el segundo numero");
		double num2 = teclado.nextDouble();
		
		double distancia = Math.abs(num1-num2);
		
		System.out.printf("la distancia es %.3f \n",distancia);
		teclado.close();
	}

}
