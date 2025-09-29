package part_2;

import java.util.Scanner;

public class Exercsise09 {

	public static void main(String[] args) {
		// Declaramos la variable del número
		int numero;
		
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos por pantalla el número del problema
		System.out.println("Indique el numero del problema: ");
		// La guardamos con Scanner
		numero = sc.nextInt();
		
		// Calculamos el volumen según la fórmula dada
		numero = (numero - 100) / 100 + 1;
		
		// Mostramos el resultado por pantalla
		System.out.println("Volumen: " + numero);

		// Cerramos Scanner
		sc.close();		
	}

}
