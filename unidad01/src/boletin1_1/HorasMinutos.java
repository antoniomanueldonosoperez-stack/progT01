package boletin1_1;

import java.util.Scanner;

public class HorasMinutos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una cantidad de minutos");
		int minutos = teclado.nextInt();

		int horas = minutos / 60;
		int minutosRestantes = minutos % 60;

		System.out.printf("Los minutos introducidos son %d horas y %d minutos \n", horas, minutosRestantes);

		teclado.close();
	}

}