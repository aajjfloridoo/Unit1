package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Declaramos las variables
		int nota1, nota2;
		float media;
		//Iniciamos Scanner
		Scanner reader = new Scanner(System.in);
		// Pedimos las variables por teclado y hacemops que reader las guarde
		System.out.println("Escriba su primera nota: ");
		nota1 = reader.nextInt();
		System.out.println("Escriba su segunda nota: ");
		nota2 = reader.nextInt();
		// Calculamos la media 
		media = (nota1 + nota2) / 2.0;
		// Enseñamos la media por pantalla
		System.out.println("\nSu media aritmética es: " + media);
		//Cerramos reader
		reader.close();
	}

}
