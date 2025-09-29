package part_1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// Declaracion de la constante IVA
		final int IVA = 21;
		// Declaracion variable del precio
		float precio;
		// Declaracion variable cantidad
		float cantidad;
		// Declaracion variable del precio nuevo
		float precioNuevo;
		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos el precio por teclado
		System.out.println("Indique el precio por favor: ");
		// Leemos y guardamos
		precio = sc.nextFloat();
		// Calculamos nuevo precio con IVA añadido
		cantidad = (IVA * precio) / 100;
		// Calculamos precio nuevo
		precioNuevo = precio + cantidad;
		// Mostramos por pantalla el nuevo precio
		System.out.println("El precio junto con el IVA es: " + precioNuevo);
		// Cerramos Scanner
		sc.close();
	}
}
