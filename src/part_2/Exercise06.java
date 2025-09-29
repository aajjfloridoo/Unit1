package part_2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		double dist1;
		double dist2;
		double dist3;

		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla el numero
		System.out.println("Indique la distancia en milimetros: ");
		// Pedimos que lo lea Scanner
		dist1 = sc.nextDouble();
		// Pedimos por pantalla el numero
		System.out.println("Indique la distancia en centímetros: ");
		// Pedimos que lo lea Scanner
		dist2 = sc.nextDouble();
		// Pedimos por pantalla el numero
		System.out.println("Indique la distancia en metros: ");
		// Pedimos que lo lea Scanner
		dist3 = sc.nextDouble();
		
		dist1 = dist1 / 10;
		dist3 = dist3 * 100;
		
		System.out.println("Distancias en centímetros:\n ---Distancia 1: " + dist1 + "\n---Distancia 2: " + dist2 + "\n---Distancia 3: " + dist3);
		
		sc.close();
		
		
	}
}
