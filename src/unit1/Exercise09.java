package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		int edad;
		boolean verdadero = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su edad: ");
		edad = sc.nextInt();
		if (edad >= 18) {
			verdadero = true;
		}
		if (verdadero == true) {
			System.out.println("Usted es mayor de edad.");
		} else {
			System.out.println("Usted no es mayor de edad.");
		}
	}
}
