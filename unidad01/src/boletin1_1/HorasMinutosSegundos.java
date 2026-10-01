package boletin1_1;

import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca los segundos");
		int segundosTotales = teclado.nextInt();
		int minutos = segundosTotales / 60;
		int segundos = segundosTotales % 60;
		int horas = minutos / 60;
		int minutosTotales = minutos % 60;

		System.out.printf("Las horas son %d , los minutos %d y los segundos %d \n", horas, minutosTotales, segundos);

		teclado.close();
	}

}
