package part_1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Declaración de variable del beneficio de las peras
		float benefPeras;
		// Declaración de variable del beneficio de las manzanas
		float benefManzanas; 
		// Declaración de variable de las ventas de las peras
		float ventaPeras;
		// Declaración de variable de las ventas de las manzanas
		float ventaManzanas;
		// Declaración de variable de los beneficios totales
		float total;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el número de ventas de peras
		System.out.println("Indique el número de ventas de peras: ");
		// Asimismo, leemos y guardamos con el Scanner
		ventaPeras = sc.nextFloat();
		// Pedimos por teclado el número de ventas de manzanas
		System.out.println("Indique el número de ventas de manzanas: ");
		// Asimismo, leemos y guardamos con el Scanner
		ventaManzanas = sc.nextFloat();
		// Calculamos los beneficios de peras
		benefPeras = ventaPeras * 1.95f;
		// Calculamos los beneficios de manzanas
		benefManzanas = ventaManzanas * 2.35f;
		// Calculamos el total de beneficios
		total = benefManzanas + benefPeras;
		// Enseñamos el resultado por pantalla
		System.out.println("Los beneficios totales son: " + total);
		// Cerramos Scanner
		sc.close();

	}

}
