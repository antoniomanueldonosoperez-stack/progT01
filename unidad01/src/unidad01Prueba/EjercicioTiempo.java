package unidad01Prueba;

import java.util.Scanner;

public class EjercicioTiempo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Tienes que ir a la biblioteca");
		boolean biblioteca = teclado.nextBoolean();
		System.out.println("¿Esta lloviendo?");
		boolean condicionTiempo = teclado.nextBoolean();
		System.out.println("has relizado las tareas");
		boolean tareas = teclado.nextBoolean();

		boolean salirCalle = (biblioteca == true || tareas == true && condicionTiempo == false);
		System.out.println("Salir a la calle: " + salirCalle);

		teclado.close();

	}

}
