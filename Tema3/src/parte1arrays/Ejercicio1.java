package parte1arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos un objeto tipo random para generar numeros aleatorios
		Random rand = new Random();

		/*
		 * Creamos la tabla que guarde 10 valores aleatorios que le asignaremos mas
		 * tarde en el for
		 */
		int tabla[] = new int[10];

		/*
		 * Creamos un for con un contador que asigne un numero aleatorio a cada valor de
		 * la tabla
		 */
		for (int num = 0; num < 10; num++) {
			tabla[num] = rand.nextInt(1, 101);
		}

		// Imprimimos el valor de la tabla entera
		System.out.println(Arrays.toString(tabla));

	}

}
