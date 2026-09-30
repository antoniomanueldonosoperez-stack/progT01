package unidad01Prueba;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce la segunda nota");
		int num2 = teclado.nextInt();
		
		double media = (num1 + num2 )* 1.0 /2;
		
		System.out.printf("La media de las notas es %.3f \n",media);
		
		teclado.close();
	}

}
