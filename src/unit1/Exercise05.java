package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Declaramos las variables
		double radio, longitud, area;
		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos el radio por teclado
		System.out.println("Por favor, indique el radio de la cirunferencia: ");
		// Hacemos que Scanner lo guarde
		radio = sc.nextFloat();
		// Calculamos la longitud y el area
		longitud = 2.0 * Math.PI * radio;
		area = (Math.PI * radio * radio) * 1.0;
		// Enseñamos ambos por pantalla
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		// Cerramos Scanner
		sc.close();
	}
}

