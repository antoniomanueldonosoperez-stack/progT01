package unidad01Prueba;

import java.util.Scanner;

public class Diapositiva114NumCapicua {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		int numero = teclado.nextInt();
		
		if (numero >= 0 && numero <=9999) {
			
			if (numero >=1000) {
				int primera = numero / 1000;
			}else if (numero >=100) {
				int segunda = numero / 100;
			}
			
		}else
			System.out.println("El numero introducido no esta en el rango de numeros");
		
		teclado.close();
	}

}
