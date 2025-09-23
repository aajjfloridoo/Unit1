package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Declaración de la variable de las pesetas
		float pesetas;
		// Declaración de la variable de los euros
		float euros;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el valor en pesetas
		System.out.println("Indique el valor de las pesetas: ");
		// Asimismo, leemos y guardamos con el Scanner
		pesetas = sc.nextFloat();
		// Calculamos la conversión de pesetas a euros
		euros = pesetas / 166;
		// Enseñamos el resultado por pantalla
		System.out.println(pesetas + " pesetas en euros son: " + euros);
		// Cerramos Scanner
		sc.close();
	}
}
