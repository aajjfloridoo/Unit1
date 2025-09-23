package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		// Declaración de variable de si llueve o no
		boolean llueve;
		// Declaración de variable de si el usuario ha finalizado las tareas
		boolean finalizadoTareas;
		// Declaración de variable de si el usuario necesita ir a la biblioteca
		boolean irBiblio;
		// Declaración de variable de si el usuario puede salir o no
		boolean puedeSalir = false;

		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por teclado si está lloviendo
		System.out.println("Indique si está lloviendo (true es sí/false es no): ");
		// Asimismo, leemos y guardamos con el Scanner
		llueve = sc.nextBoolean();

		// Pedimos por teclado si ha finalizado las tareas
		System.out.println("Indique si ha acabado las tareas (true es sí/false es no): ");
		// Asimismo, leemos y guardamos con el Scanner
		finalizadoTareas = sc.nextBoolean();

		// Pedimos por teclado si necesita ir a la biblioteca
		System.out.println("Indique si necesita ir a la biblioteca (true es sí/false es no): ");
		// Asimismo, leemos y guardamos con el Scanner
		irBiblio = sc.nextBoolean();

		// Evaluamos la condición para saber si puede salir
		if ((!llueve && finalizadoTareas) || irBiblio) {
			puedeSalir = true;
		}

		// Enseñamos el resultado por pantalla
		System.out.println("¿Puede salir el usuario?: " + puedeSalir);

		// Cerramos Scanner
		sc.close();
	}
}
