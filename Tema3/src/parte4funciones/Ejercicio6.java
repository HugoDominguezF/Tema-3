package parte4funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tabla[] = { 10, 1, 5, 8, 9, 2 };

		int num = 0;

		System.out.println("Cuantos numeros quieres sumar");
		num = sc.nextInt();

		int respuesta[] = new int[tabla.length - num + 1];

		respuesta = suma(tabla, num);

		System.out.println(Arrays.toString(respuesta));

		sc.close();

	}

	static int[] suma(int tabla[], int num) {

		int tabla2[] = new int[tabla.length - num + 1];
		int suma = 0;

		for (int fin = num - 1; fin < tabla.length; fin++, suma = 0) {

			for (int inicio = fin - num + 1; inicio <= fin; inicio++) {

				suma += tabla[inicio];

			}
			tabla2[fin - num + 1] = suma;
		}

		return tabla2;
	}
}
