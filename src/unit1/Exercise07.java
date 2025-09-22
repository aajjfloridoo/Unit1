package unit1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		String nombre, direccion, numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Indique su direccion: ");
		direccion = sc.nextLine();
		System.out.println("Indique su numero: ");
		numero = sc.nextLine();
		System.out.print("Nombre: " + nombre);
		System.out.print("\n");
		System.out.print("Dirección: " + direccion);
		System.out.print("\n");
		System.out.print("Teléfono: " + numero);	
		sc.close();
	}
}
