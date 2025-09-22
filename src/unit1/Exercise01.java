package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// declaramos las variables
		int numero;
		// Iniciamos Scanner
		Scanner reader = new Scanner(System.in);
		// Pedimos numero por teclado
		System.out.println("Escriba un número: ");
		// Hacemos que Scanner lo guarde
		numero = reader.nextInt();
		// Lo enseñamos por pantalla
		System.out.println("\nSu numero es: " + numero);
		// Cerramos Scanner
		reader.close();
	}

}

