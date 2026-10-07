package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva103 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		int numero = teclado.nextInt();

		if (numero >= 0 && numero <= 99999) {
			if (numero >= 0 && numero <= 9) {
				System.out.println("Tu numero tiene 1 cifra");
			} else if (numero >= 10 && numero <= 99) {
				System.out.println("Tu numero tiene 2 cifra");
			} else if (numero >= 100 && numero <= 999) {
				System.out.println("Tu numero tiene 3 cifra");
			} else if (numero >= 1000 && numero <= 9999) {
				System.out.println("Tu numero tiene 4 cifra");
			} else if (numero >= 10000 && numero <= 99999) {
				System.out.println("Tu numero tiene 5 cifra");
			}
		} else {
			System.out.println("ERROR: tu numero supera las cifras o es un numero negativo");
		}

		teclado.close();
	}

}
