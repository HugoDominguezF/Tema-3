package parte4funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tabla[] = { 1, 2, 3, 4, 5, 2, 4, 3, 2, 1 };
		int num;

		System.out.println("Que numero quieres buscar");
		num = sc.nextInt();

		int resultado[] = buscarTodos(tabla, num);

		System.out.println(Arrays.toString(resultado));
		sc.close();
	}

	static int[] buscarTodos(int tabla[], int num) {

		int tamaño = 0;
		int siguiente = 0;

		for (int contador = 0; contador < tabla.length; contador++) {
			if (tabla[contador] == num) {
				tamaño++;
			}
		}

		int tablaNueva[] = new int[tamaño];

		for (int contador = 0; contador < tabla.length; contador++) {
			if (tabla[contador] == num) {
				tablaNueva[0 + siguiente] = contador;
				siguiente++;
			}
		}

		return tablaNueva;
	}
}
