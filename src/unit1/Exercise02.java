package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Declaramos las variables
		int edad, edad1;
		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado edad
		System.out.println("Escriba un edad: ");
		// La guardamos
		edad = sc.nextInt();
		// Calculamos la nuev edad
		edad1 = edad + 1;
		// La enseñamos por pantalla
		System.out.println("\nSu edad es: " + edad1);
		// Cerramos Scanner
		sc.close();
	}

}

