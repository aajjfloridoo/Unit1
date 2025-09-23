package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// Declaracion de nota media del primer trimestre
		int primero;
		// Declaracion de nota media del segundo trimestre
		int segundo;
		// Declaracion de nota media del tercer trimestre
		int tercero;
		// Declaracion de variable de nota media del boletin de calificaciones (entera)
		int media1;
		// Declaracion de variable de nota media del expediente académico (decimal)
		float media2;
		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos la nota del primer trimestre
		System.out.println("Indique la nota del primer trimestre: ");
		// Leemos y guardamos con el Scanner
		primero = sc.nextInt();
		// Pedimos la nota del primer trimestre
		System.out.println("Indique la nota del segundo trimestre: ");
		// Leemos y guardamos con el Scanner
		segundo = sc.nextInt();
		// Pedimos la nota del primer trimestre
		System.out.println("Indique la nota del tercer trimestre: ");
		// Leemos y guardamos con el Scanner
		tercero = sc.nextInt();
		// Calculamos la media, solo parte entera
		media1 = (primero + segundo + tercero) / 3;
		// Calculamos la media con decimales
		media2 = (primero + segundo + tercero) / 3.0f;
		// Imprimimos por pantalla la nota del boletin
		System.out.println("Nota del boletin: " + media1);
		// Imprimimos por pantalla la nota del expediente
		System.out.println("Nota del expediente: " + media2);
		// Cerramos Scanner
		sc.close();
	}
}
