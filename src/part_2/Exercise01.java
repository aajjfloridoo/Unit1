package part_2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Declaracion variable de un numero con decimales
		double numero;
		
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos por pantalla el numero
		System.out.println("Indique el numero con decimales: ");
		// Pedimos que lo lea Scanner
		numero = sc.nextDouble();
		// Calculamos si es redondeable a un entero mas o no
		numero = (int)(numero + 0.5);
		// Enseñamos por pantalla
		System.out.println("Su numero redondeado es: " + numero);
		// Cerramos Scanner
		sc.close();
				
	}
}
