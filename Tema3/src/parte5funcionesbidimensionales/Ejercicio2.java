package parte5funcionesbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int filas;
		int columnas;

		System.out.println("Cuantas filas quieres");
		filas = sc.nextInt();

		System.out.println("Cuantas columnas quieres");
		columnas = sc.nextInt();

		int tabla[][] = new int[filas][columnas];

		int tablaFinal[][] = transpuesta(tabla);
		
		for (int linea = 0; linea < tablaFinal.length; linea++) {
			
			System.out.print(Arrays.toString(tablaFinal[linea]));
			
			System.out.println("");
		}
		sc.close();
	}

	static int[][] transpuesta(int tabla[][]) {

		int num = 1;

		int tablaNueva[][] = new int[tabla[1].length][tabla.length];
		
		for (int linea = 0; linea < tabla.length; linea++) {

			for (int columna = 0; columna < tabla[linea].length; columna++, num++) {

				tablaNueva[columna][linea] = num;
			}
		}
		return tablaNueva;
	}
}
