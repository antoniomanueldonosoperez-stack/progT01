package boletin1_2;

import java.util.Scanner;
import java.time.YearMonth;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una fecha");
		System.out.println("Introduce un dia");
		int dia = teclado.nextInt();
		System.out.println("Introduce un mes");
		int mes = teclado.nextInt();
		System.out.println("Introduce un anio");
		int anio = teclado.nextInt();

		boolean correcta = false;

		if (mes >= 1 && mes <= 12 && anio >= 1) {
			YearMonth fecha = YearMonth.of(anio, mes);

			if (dia >= 1 && dia <= fecha.lengthOfMonth()) {
				correcta = true;
			}
		}

		if (correcta) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha es incorrecta");
		}
		teclado.close();
	}

}
