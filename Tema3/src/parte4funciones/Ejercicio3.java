package parte4funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int longitud;
		int fin;

		System.out.println("Diga la longitud de la tabla");
		longitud = sc.nextInt();

		System.out.println("Digame el numero final del intervalo aleatorio");
		fin = sc.nextInt();

		int resultado[] = rellenaPares(longitud, fin);

		System.out.println(Arrays.toString(resultado));

		sc.close();

	}

	static int[] rellenaPares(int longitud, int fin) {

		Random rand = new Random();

		int tabla[] = new int[longitud];

		for (int contador = 0; contador < tabla.length; contador++) {
			do {
				tabla[contador] = rand.nextInt(2, fin);
			} while (tabla[contador] % 2 != 0);
		}

		Arrays.sort(tabla);

		return (tabla);
	}
}
