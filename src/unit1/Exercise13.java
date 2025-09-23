package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		boolean llueve, finalizadoTareas, irBiblio, puedeSalir = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique si está lloviendo (true es sí/false es no): ");
		llueve = sc.nextBoolean();
		System.out.println("Indique si ha acabado las tareas (true es sí/false es no): ");
		finalizadoTareas = sc.nextBoolean();
		System.out.println("Indique si necesita ir a la biblioteca (true es sí/false es no): ");
		irBiblio = sc.nextBoolean();

		if ((!llueve && finalizadoTareas) || irBiblio) {
			puedeSalir = true;
		}
		
		System.out.println("¿Puede salir el usuario?: " + puedeSalir);

		sc.close();
	}
}
