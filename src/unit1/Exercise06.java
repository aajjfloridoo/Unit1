package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Declaración delas variables
		double numero1, numero2, suma, resta, multiplicacion, division;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado los dos numeros
		System.out.println("Indique el primer numero: ");
		// Asimismo, leemos y guardamos con el Scanner
		numero1 = sc.nextDouble();
		System.out.println("Indique el segundo numero: ");
		numero2 = sc.nextDouble();
		// Calculamos las variables
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * 1.0 * numero2;
		division = numero1 * 1.0 / numero2;
		// Enseñamos los resultados por pantalla
		System.out.println("La suma de ambos numeros es: " + suma);
		System.out.println("La resta de ambos numeros es: " + resta);
		System.out.println("La multiplicacion de ambos numeros es: " + multiplicacion);
		System.out.println("La division de ambos numeros es: " + division);
		// Cerramos Scanner
		sc.close();
	}

}
