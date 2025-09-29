package part_1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Declaramos la variable del radio
		double radio;
		// Declaramos la variable de la longitud
		double longitud;
		// Declaramos la variable del area
		double area;
		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos el radio por teclado
		System.out.println("Por favor, indique el radio de la cirunferencia: ");
		// Hacemos que Scanner lo guarde
		radio = sc.nextFloat();
		// Calculamos la longitud y el area
		longitud = 2.0 * Math.PI * radio;
		// Calculamos el area
		area = (Math.PI * radio * radio) * 1.0;
		// Enseñamos longitud por pantalla
		System.out.println("La longitud de la circunferencia es: " + longitud);
		// Enseñamos area por pantalla
		System.out.println("El area de la circunferencia es: " + area);
		// Cerramos Scanner
		sc.close();
	}
}
