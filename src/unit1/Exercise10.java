package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Declaración de la variable del numero
		int numero;
		// Declaración de la variable del resto
		int resto;
		// Declaración de la variable booleana que guarda si el numero es par o no
		boolean verdadero = false;
		// Iniciamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos por teclado el número
		System.out.println("Indique un numero: ");
		// Asimismo, leemos y guardamos con el Scanner
		numero = sc.nextInt();
		// Calculamos el resto de dividir entre 2
		resto = numero % 2;
		// Evaluamos y enseñamos el resultado por pantalla
		if (resto == 0) {
			System.out.println("Su numero es par, ya que el resto es 0");
		} else {
			System.out.println("Su numero no es par, ya que el resto es " + resto);
		}
		// Cerramos Scanner
		sc.close();
	}
}
