package unidad01Prueba;

import java.util.Scanner;

public class aritmetica {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int num1 =  teclado.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int num2 =  teclado.nextInt();

		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2; 
		double division = (num1 * 1.0) / num2;
		
		System.out.printf("El resultado de la suma es %d, la resta %d , la multiplicacion %d y la division %.3f \n",suma,resta,multiplicacion,division);
		
		
		teclado.close();
	}

}
