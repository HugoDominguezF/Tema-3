package parte5funcionesbidimensionales;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int girada[][] = new int[tabla.length][tabla[0].length];

		girada = gira90(tabla);

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				System.out.print(girada[i][j] + "\t");

			}
			System.out.println();
		}

	}

	static int[][] gira90(int tabla[][]) {

		int num;

		int tabla2[][] = new int[tabla.length][tabla[0].length];

		for (int i = 0; i < tabla.length; i++) {
			 
			for (int j = 0; j < tabla[0].length; j++) {

				num = i - (tabla.length - 1);

				if (num < 0) {
					num *= -1;
				}

				tabla2[j][num] = tabla[i][j];

			}
		}

		return tabla2;
	}
}
