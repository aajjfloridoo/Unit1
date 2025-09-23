package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Declaración de la variable del numero 1
		double numero1;
		// Declaración de la variable del numero 2
		double numero2; 
		// Declaración de la variable de la suma
		double suma;
		// Declaración de la variable de la resta
		double resta; 
		// Declaración de la variable de la multiplicacion
		double multiplicacion; 
		// Declaración de la variable de la division
		double division;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el primer numero
		System.out.println("Indique el primer numero: ");
		// Asimismo, leemos y guardamos con el Scanner numero1
		numero1 = sc.nextDouble();
		// Pedimos por teclado el segundo numero
		System.out.println("Indique el segundo numero: ");
		// Asimismo, leemos y guardamos con el Scanner numero2
		numero2 = sc.nextDouble();
		// Calculamos suma
		suma = numero1 + numero2;
		// Calculamos resta
		resta = numero1 - numero2;
		// Calculamos multiplicacion
		multiplicacion = numero1 * 1.0 * numero2;
		// Calculamos division
		division = numero1 * 1.0 / numero2;
		// Enseñamos el resultado de la suma por pantalla
		System.out.println("La suma de ambos numeros es: " + suma);
		// Enseñamos el resultado de la resta por pantalla
		System.out.println("La resta de ambos numeros es: " + resta);
		// Enseñamos el resultado de la multiplicacion por pantalla
		System.out.println("La multiplicacion de ambos numeros es: " + multiplicacion);
		// Enseñamos el resultado de la division por pantalla
		System.out.println("La division de ambos numeros es: " + division);
		// Cerramos Scanner
		sc.close();
	}

}
