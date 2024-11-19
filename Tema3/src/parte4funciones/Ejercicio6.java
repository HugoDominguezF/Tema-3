package parte4funciones;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		int tabla[] = { 10, 1, 5, 8, 9, 2 };

		int respuesta[] = new int[tabla.length - 2];

		respuesta = suma(tabla);

		System.out.println(Arrays.toString(respuesta));
		
		System.out.println(Arrays.toString(tabla));

	}

	static int[] suma(int tabla[]) {

		int tabla2[] = new int[tabla.length - 2];
		int suma=0;

		for (int fin=2;fin<tabla.length;fin++,suma=0) {

			for (int inicio = fin-2; inicio <= fin; inicio++) {

				suma += tabla[inicio];

			}
			tabla2[fin-2]=suma;
		}

		return tabla2;
	}
}
