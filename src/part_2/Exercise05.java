package part_2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		double segundos;
		double horas;
		double minutos;

		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla el numero
		System.out.println("Indique el numero de segundos: ");
		// Pedimos que lo lea Scanner
		segundos = sc.nextDouble();
		
		horas = segundos / 3600;
		minutos = segundos / 60;
		
		System.out.println("Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos);
		
		sc.close();
	}
}
