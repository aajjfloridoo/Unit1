package part_1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Declaración de la variable que guarda el nombre
		String nombre;
		// Declaración de la variable que guarda la edad como decimal
		String edad;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el nombre
		System.out.println("Indique su nombre: ");
		// Asimismo, leemos y guardamos con el Scanner
		nombre = sc.nextLine();
		// Pedimos por teclado la edad
		System.out.println("Indique su edad: ");
		// Asimismo, leemos y guardamos con el Scanner
		edad = sc.nextLine();
		// Enseñamos el resultado por pantalla
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		// Cerramos Scanner
		sc.close();
	}
}
