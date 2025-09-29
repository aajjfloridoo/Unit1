package part_1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Declaramos la variable de la primera nota
		int nota1;
		// Declaramos la variable de la segunda nota
		int nota2;
		// Declaramos la variable de la media
		float media;
		// Iniciamos Scanner
		Scanner reader = new Scanner(System.in);
		// Pedimos la variable por teclado y hacemos que las guarde el Scanner
		System.out.println("Escriba su primera nota: ");
		// Asimismo, leemos y guardamos con el Scanner
		nota1 = reader.nextInt();
		// Pedimos la variable por teclado y hacemos que las guarde el Scanner
		System.out.println("Escriba su segunda nota: ");
		// Asimismo, leemos y guardamos con el Scanner
		nota2 = reader.nextInt();
		// Calculamos la media
		media = (nota1 + nota2) / 2;
		// Enseñamos la media por pantalla
		System.out.println("\nSu media aritmética es: " + media);
		// Cerramos reader
		reader.close();
	}

}
