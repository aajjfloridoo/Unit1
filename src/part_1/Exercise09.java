package part_1;

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
		// Establecemos la condicion para que sea mayor de edad
		verdadero = edad>=18;
		// Si verdadero, imprimimos que es mayor de edad
		System.out.println("Es mayor de edad:" + verdadero);
		// Cerramos Scanner
		sc.close();
	}
}
