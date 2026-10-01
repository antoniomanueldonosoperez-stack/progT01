package boletin1_1;

import java.util.Scanner;

public class AlgoritmoEdad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad = teclado.nextInt();
		System.out.println("Eres vip: TRUE/FALSE");
		boolean vip = teclado.nextBoolean();
		String mensaje = (edad >= 18 || vip )?"Acceso permitido":"Acceso denegado";
		System.out.println(mensaje);
		
		teclado.close();
	}

}
