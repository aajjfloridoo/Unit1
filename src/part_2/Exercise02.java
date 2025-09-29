package part_2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Declaracion del numero entero
		int num;
		
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
				
		// Pedimos por pantalla el numero
		System.out.println("Indique el numero entero: ");
		// Pedimos que lo lea Scanner
		num = sc.nextInt();
		// Calculamos cuanto le falta para ser multiplo
		num = 7 - num % 7;
		
		// Enseñamos por pantalla
		System.out.println("La cantidad que hay que sumar es: " + num);
		
		// Cerramos Scanner
		sc.close();
	}
}
