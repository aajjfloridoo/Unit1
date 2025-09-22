package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		int numero;
		Scanner reader = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		numero = reader.nextInt();
		System.out.println("\nSu numero es: " + numero);
		reader.close();
	}

}
