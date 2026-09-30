package unidad01Prueba;

import java.util.Scanner;

public class edad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su edad actual");
		int edad = teclado.nextInt();
		
		System.out.printf("Su edad actual es %d y su edad el siguiente annio sera %d \n",edad,++edad );
		
		
		
		teclado.close();
	}

}
