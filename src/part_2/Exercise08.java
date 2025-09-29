package part_2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Declaramos la variable de la longitud en metros
		double num;
		// Declaramos la variable de la longitud en centímetros
		double cent;
		
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos por pantalla la longitud en metros
		System.out.println("Indique la longitud en metros: ");
		// La guardamos con Scanner
		num = sc.nextDouble();
		
		// Convertimos metros a centímetros
		cent = num * 100;
		// Convertimos el resultado a entero
		num = (int)cent;
		
		// Mostramos la longitud en centímetros por pantalla
		System.out.println("Longitud en centimetros: " + num);
		
		// Cerramos Scanner
		sc.close();
	}

}