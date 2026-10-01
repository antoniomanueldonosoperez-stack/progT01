package boletin1_1;

import java.util.Scanner;

public class AlgoritmoDinero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca cuantas monedas de 2 € tiene");
		int monedas2E= teclado.nextInt();
		System.out.println("Introduzca cuantas monedas de 1 € tiene");
		int monedas1E= teclado.nextInt();
		System.out.println("Introduzca cuantas monedas de 50 cent tiene");
		int monedas50Cent= teclado.nextInt();
		System.out.println("Introduzca cuantas monedas de 20 cent tiene");
		int monedas20Cent= teclado.nextInt();
		System.out.println("Introduzca cuantas monedas de 10 cent tiene");
		int monedas10Cent= teclado.nextInt();
		int centimosSuma=(monedas2E*200)+(monedas1E*100)+(monedas50Cent*50)+(monedas20Cent*20)+(monedas10Cent*10);
		int eurosTotales=centimosSuma/100;
		int centimosTotales = centimosSuma % 100;
		System.out.printf("Tienes %d Euros y %d centimos \n",eurosTotales,centimosTotales);
		
		teclado.close();
	}

}
