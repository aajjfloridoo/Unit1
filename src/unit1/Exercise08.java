package unit1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		String nombre, edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Indique su edad: ");
		edad = sc.nextLine();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		sc.close();
	}
}
