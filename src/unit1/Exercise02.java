package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		int edad, edad1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un edad: ");
		edad = sc.nextInt();
		edad1 = edad + 1;
		System.out.println("\nSu edad es: " + edad1);
		sc.close();
	}

}
