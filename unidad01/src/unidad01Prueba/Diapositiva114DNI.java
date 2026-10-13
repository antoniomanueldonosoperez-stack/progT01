package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva114DNI {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tu DNI para decir cual es tu letra");
		int numDNI = teclado.nextInt();

		if (numDNI >= 0 && numDNI <= 99999999) {
			int resto = numDNI % 23;
			switch (resto) {
			case 0 -> System.out.println("La letra es T");
			case 1 -> System.out.println("La letra es R");
			case 2 -> System.out.println("La letra es W");
			case 3 -> System.out.println("La letra es A");
			case 4 -> System.out.println("La letra es G");
			case 5 -> System.out.println("La letra es M");
			case 6 -> System.out.println("La letra es Y");
			case 7 -> System.out.println("La letra es F");
			case 8 -> System.out.println("La letra es P");
			case 9 -> System.out.println("La letra es D");
			case 10 -> System.out.println("La letra es X");
			case 11 -> System.out.println("La letra es B");
			case 12 -> System.out.println("La letra es N");
			case 13 -> System.out.println("La letra es J");
			case 14 -> System.out.println("La letra es Z");
			case 15 -> System.out.println("La letra es S");
			case 16 -> System.out.println("La letra es Q");
			case 17 -> System.out.println("La letra es V");
			case 18 -> System.out.println("La letra es H");
			case 19 -> System.out.println("La letra es L");
			case 20 -> System.out.println("La letra es C");
			case 21 -> System.out.println("La letra es K");
			case 22 -> System.out.println("La letra es E");
			default -> System.out.println("Resto no válido");
			}
		}else {
			System.out.println("El numero de DNI no es valido");
		}

		teclado.close();
	}

}
