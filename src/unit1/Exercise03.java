package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		int añoActual, añoNacimiento, edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el año actual: ");
		añoActual = sc.nextInt();
		System.out.println("Escriba su año de nacimiento: ");
		añoNacimiento = sc.nextInt();
		edad = añoActual - añoNacimiento;
		System.out.println("\nSu edad es: " + edad);
		sc.close();
	}

}
