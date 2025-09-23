package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Declaración de la variable de edad
		int edad;
		// Declaración de la variable booleana que guarda si es mayor de edad o no
		boolean verdadero = false;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado la edad
		System.out.println("Indique su edad: ");
		// Asimismo, leemos y guardamos con el Scanner
		edad = sc.nextInt();
		// Si edad es mayor o igual a 18
		if (edad >= 18) {
			// verdadero es true
			verdadero = true;
		}
		// Si verdadero es igual igual a true, imprimimos que es mayor de edad
		if (verdadero == true) {
			System.out.println("Usted es mayor de edad.");
		} else {
			// Si verdadero es no es igual igual a true, imprimimos que es no mayor de edad
			System.out.println("Usted no es mayor de edad.");
		}
		// Cerramos Scanner
		sc.close();
	}
}
