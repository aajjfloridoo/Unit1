package part_2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Declaramos la variable de entradas infantiles
		int entradasInfantiles = 0;
		// Declaramos la variable de entradas de adultos
		int entradasAdultos = 0;
		// Declaramos la variable del importe total
		double importe;
		
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla el numero de menores
		System.out.println("Indique el numero de menores: ");
		// La guardamos con Scanner
		entradasInfantiles = sc.nextInt();
		// Pedimos por pantalla el numero de adultos
		System.out.println("Indique el numero de adultos: ");
		// La guardamos con Scanner
		entradasAdultos = sc.nextInt();
		
		// Calculamos el importe total
		importe = (double)(entradasAdultos * 20) + (double)(entradasInfantiles * 15.5);
		
		// Aplicamos descuento del 5% si el importe es mayor o igual a 100
		importe = importe >= 100 ? importe * 0.95 : importe;

		// Mostramos el importe por pantalla
		System.out.println("El importe es: " + importe);
		
		// Cerramos Scanner
		sc.close();
	}

}
