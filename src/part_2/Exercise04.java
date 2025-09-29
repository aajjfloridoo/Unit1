package part_2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Declaracion de las variables de tipo Double
		double a;
		double b;
		double c;
		double x;
		// Declaracion de y
		double y;
		
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla el numero
		System.out.println("Indique el coeficiente a: ");
		// Pedimos que lo lea Scanner
		a = sc.nextDouble();
		// Pedimos por pantalla el numero
		System.out.println("Indique el coeficiente b: ");
		// Pedimos que lo lea Scanner
		b = sc.nextDouble();
		// Pedimos por pantalla el numero
		System.out.println("Indique el coeficiente c: ");
		// Pedimos que lo lea Scanner
		c = sc.nextDouble();
		// Pedimos por pantalla el numero
		System.out.println("Indique el coeficiente x: ");
		// Pedimos que lo lea Scanner
		x = sc.nextDouble();
		
		// Calculamos y
		y = (a * x * x) + (b * x) + c; 		
		
		// Enseñamos por pantalla el y
		System.out.println("Y: " + y);
		
		// Cerramos Scanner
		sc.close();
		
		
	}
}
