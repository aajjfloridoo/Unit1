package part_2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Declaracion del numero entero
		int num1;
		// Declaracion del numero entero
		int num2;

		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla el numero
		System.out.println("Indique el primer numero entero: ");
		// Pedimos que lo lea Scanner
		num1 = sc.nextInt();
		// Pedimos por pantalla el numero
		System.out.println("Indique el segundo numero entero: ");
		// Pedimos que lo lea Scanner
		num2 = sc.nextInt();
		// Calculamos cuanto le falta para ser multiplo
		num1 = num2 - num1 % num2;

		// Enseñamos por pantalla
		System.out.println("La cantidad que hay que sumar al numero 1 es: " + num1);

		// Cerramos Scanner
		sc.close();
	}
}
