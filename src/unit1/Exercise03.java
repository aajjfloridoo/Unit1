package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Declaramos variables
		int añoActual, añoNacimiento, edad;
		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos año actual por teclado
		System.out.println("Escriba el año actual: ");
		// Leemos y guardamos
		añoActual = sc.nextInt();
		// Pedimos año de nacimiento por teclado
		System.out.println("Escriba su año de nacimiento: ");
		// Leemos y guardamos
		añoNacimiento = sc.nextInt();
		// Calculamos la edad
		edad = añoActual - añoNacimiento;
		// Mostramos edad por pantalla
		System.out.println("\nSu edad es: " + edad);
		// Cerramos Scanner
		sc.close();
	}

}

