package boletin1_1;

import java.util.Scanner;

public class PerimetroArea {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la base");
		int base = teclado.nextInt();
		System.out.println("Introduce la base");
		int altura = teclado.nextInt();

		int perimetro = (base * 2) + (altura * 2);
		int area = base * altura;

		System.out.printf("el perimetro es %d y su area es %d  \n", perimetro,area);
		teclado.close();
	}

}
