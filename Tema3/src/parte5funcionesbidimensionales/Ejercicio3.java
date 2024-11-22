package parte5funcionesbidimensionales;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {

		boolean simetrico;

		int tabla[][] = { { 1, 2, 3 }, { 2, 3, 2 }, { 3, 2, 1 } };

		simetrico = simetria(tabla);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));

		}

		if (simetrico) {

			System.out.println("La tabla es simetrica");

		} else {

			System.out.println("La tabla NO es simetrica");
		}

	}

	static boolean simetria(int tabla[][]) {

		boolean comprobar = true;

		if (tabla.length != tabla[0].length) {

			comprobar = false;

		} else {

			for (int ancho = 0; ancho < tabla.length && comprobar; ancho++) {

				for (int alto = 0; alto < tabla[0].length && comprobar; alto++) {

					if (tabla[ancho][alto] != tabla[alto][ancho]) {

						comprobar = false;

					}
				}
			}
		}

		return comprobar;
	}
}
