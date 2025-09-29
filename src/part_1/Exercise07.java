package part_1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Declaración de la variable del nombre
		String nombre;
		// Declaración de la variable de la direccion
		String direccion;
		// Declaración de la variable del numero
		String numero;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el nombre
		System.out.println("Indique su nombre: ");
		// Asimismo, leemos y guardamos con el Scanner
		nombre = sc.nextLine();
		// Pedimos por teclado la dirección
		System.out.println("Indique su direccion: ");
		// Asimismo, leemos y guardamos con el Scanner
		direccion = sc.nextLine();
		// Pedimos por teclado el número
		System.out.println("Indique su numero: ");
		// Asimismo, leemos y guardamos con el Scanner
		numero = sc.nextLine();
		// Enseñamos los resultados por pantalla
		System.out.print("Nombre: " + nombre);
		// Imprimimos salto de linea
		System.out.print("\n");
		// Enseñamos la direccion por pantalla
		System.out.print("Dirección: " + direccion);
		// Imprimimos salto de linea
		System.out.print("\n");
		// Enseñamos el telefono por pantalla
		System.out.print("Teléfono: " + numero);
		// Cerramos Scanner
		sc.close();
	}
}
