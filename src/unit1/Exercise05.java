package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		double radio, longitud, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, indique el radio de la cirunferencia: ");
		radio = sc.nextFloat();
		longitud = 2.0 * Math.PI * radio;
		area = (Math.PI * radio * radio) * 1.0;
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		sc.close();
	}
}
