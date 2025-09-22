package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		int numero, resto;
		boolean verdadero = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un numero: ");
		numero = sc.nextInt();
		resto = numero % 2;
		if (resto == 0) {
			System.out.println("Su numero es par, ya que el resto es 0");
		}
		else {System.out.println("Su numero no es par, ya que el resto es " + resto);}
		sc.close();
	}
}
