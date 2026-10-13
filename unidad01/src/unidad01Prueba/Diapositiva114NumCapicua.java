package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva114NumCapicua {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero");

		int numero = teclado.nextInt();

		if (numero >= 0 && numero <= 9999) {

			if (numero >= 1000) {
				int primeraCifra = numero / 1000;
				int segundaCifra = numero / 100 % 10;
				int terceraCifra = numero / 10 % 10;
				int ultimaCifra = numero % 10;
				if (primeraCifra == ultimaCifra && segundaCifra == terceraCifra) {
					System.out.printf("El numero %d es capicua \n", numero);
				} else {
					System.out.printf("El numero %d no es capicua \n", numero);
				}
			} else if (numero >= 100) {
				int primeraCifra = numero / 100;
				int ultimaCifra = numero % 10;
				if (primeraCifra == ultimaCifra) {
					System.out.printf("El numero %d es capicua \n", numero);
				} else {
					System.out.printf("El numero %d no es capicua \n", numero);
				}

			} else if (numero >= 10) {
				int primeraCifra = numero / 10;
				int ultimaCifra = numero % 10;
				if (primeraCifra == ultimaCifra) {
					System.out.printf("El numero %d es capicua \n", numero);
				} else {
					System.out.printf("El numero %d no es capicua \n", numero);
				}
			} else {
				System.out.printf("El numero %d es capicua \n", numero);
			}

		} else
			System.out.println("El numero introducido no esta en el rango de numeros");

		teclado.close();
	}

}
