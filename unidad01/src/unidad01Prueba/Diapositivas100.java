package unidad01Prueba;

import java.util.Scanner;

public class Diapositivas100 {

	public static void main(String[] args) {

		Scanner teclaco = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero");
		int num1 = teclaco.nextInt();
		System.out.println("Introduzca el primer numero");
		int num2 = teclaco.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero mas grande es: "+num1);
		}else {
			System.out.println("El numero mas grande es: "+num2);
		}
		
		teclaco.close();
	}

}
