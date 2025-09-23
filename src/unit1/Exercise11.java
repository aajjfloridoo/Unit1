package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		float pesetas, euros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el valor de las pesetas: ");
		pesetas = sc.nextFloat();
		euros = pesetas / 166;
		System.out.println(pesetas + " pesetas en euros son: " + euros);
		sc.close();
	}
}
