package parte2clasearrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int tabla[] = new int[1000];
		int numero;
		int valor;
		int cantidad = 0;

		for (int contador = 0; contador < 1000; contador++) {
			tabla[contador] = rand.nextInt(0, 100);
		}
		Arrays.sort(tabla);

		System.out.println("Cual numero quieres buscar");
		numero = sc.nextInt();

		for (int num = 0; num < 1000; num++) {
			valor = tabla[num];
			if (valor == numero) {
				cantidad++;
			} else if (valor > numero) {
				num = 1000;
			}

		}
		if (cantidad > 0) {
			System.out.println("El numero " + numero + " se repite " + cantidad + " veces");
		} else {
			System.out.println("El numero no aparece en la lista");
		}

		sc.close();

	}

}
