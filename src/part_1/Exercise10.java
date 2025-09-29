package part_1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Declaración de la variable del numero
		int numero;
		// Declaración de la variable del resto
		boolean resto;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el número
		System.out.println("Indique un numero: ");
		// Asimismo, leemos y guardamos con el Scanner
		numero = sc.nextInt();
		// Calculamos el resto de dividir entre 2
		resto = numero % 2 == 0;
		// Evaluamos y enseñamos el resultado por pantalla
		System.out.println("¿El número es par?: " + resto);
		// Cerramos Scanner
		sc.close();
	}
}
