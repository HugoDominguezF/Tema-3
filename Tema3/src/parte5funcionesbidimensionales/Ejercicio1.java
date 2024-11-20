package parte5funcionesbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		Random rand = new Random();

		int tabla[][] = new int[6][10];
		int resultado[] = new int[2];

		for (int linea = 0; linea < tabla.length; linea++) {

			for (int columna = 0; columna < tabla[linea].length; columna++) {

				tabla[linea][columna] = rand.nextInt(0, 1001);

				System.out.print(tabla[linea][columna] + " ");
			}
			System.out.println("");
		}

		resultado = extremos(tabla);

		System.out.println("");

		System.out.println(Arrays.toString(resultado));

	}

	static int[] extremos(int tabla[][]) {

		int maximo = 0;

		int minimo = 1000;

		for (int linea = 0; linea < tabla.length; linea++) {

			for (int columna = 0; columna < tabla[linea].length; columna++) {

				if (tabla[linea][columna] < minimo) {

					minimo = tabla[linea][columna];

				} else if (tabla[linea][columna] > maximo) {

					maximo = tabla[linea][columna];
				}
			}
		}

		int array[] = { minimo, maximo };
		return array;
	}
}
