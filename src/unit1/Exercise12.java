package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		float benefPeras, benefManzanas, ventaPeras, ventaManzanas, total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el número de ventas de peras: ");
		ventaPeras = sc.nextFloat();
		System.out.println("Indique el número de ventas de manzanas: ");
		ventaManzanas = sc.nextFloat();
		benefPeras = ventaPeras * 1.95f;
		benefManzanas = ventaManzanas * 2.35f;
		total = benefManzanas + benefPeras;
		System.out.println("Los beneficios totales son: " + total);
		sc.close();

	}

}
