package part_2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		// Declaramos la variable de los segundos
		double segundos;
		// Declaramos la variable de las horas
		double horas;
		// Declaramos la variable de los minutos
		double minutos;

		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos por pantalla el numero de segundos
		System.out.println("Indique el numero de segundos: ");
		// La guardamos con Scanner
		segundos = sc.nextDouble();
		
		// Calculamos las horas
		horas = (int)(segundos / 3600);
		// Calculamos los minutos
		minutos = (int)((segundos % 3600) / 60);
		// Calculamos los minutos
		segundos = segundos % 60;
		
		// Mostramos resultados por pantalla
		System.out.println("Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos);
		
		// Cerramos Scanner
		sc.close();
	}

}
