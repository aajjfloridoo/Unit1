package part_2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Declaramos la variable de la primera distancia
		double dist1;
		// Declaramos la variable de la segunda distancia
		double dist2;
		// Declaramos la variable de la tercera distancia
		double dist3;

		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla la distancia en milímetros
		System.out.println("Indique la distancia en milimetros: ");
		// La guardamos con Scanner
		dist1 = sc.nextDouble();
		// Pedimos por pantalla la distancia en centímetros
		System.out.println("Indique la distancia en centímetros: ");
		// La guardamos con Scanner
		dist2 = sc.nextDouble();
		// Pedimos por pantalla la distancia en metros
		System.out.println("Indique la distancia en metros: ");
		// La guardamos con Scanner
		dist3 = sc.nextDouble();
		
		// Convertimos la primera distancia a centímetros
		dist1 = dist1 / 10;
		// Convertimos la tercera distancia a centímetros
		dist3 = dist3 * 100;
		
		// Mostramos todas las distancias en centímetros por pantalla
		System.out.println("Distancias en centímetros:\n ---Distancia 1: " + dist1 + "\n---Distancia 2: " + dist2 + "\n---Distancia 3: " + dist3);
		
		// Cerramos Scanner
		sc.close();
	}

}
