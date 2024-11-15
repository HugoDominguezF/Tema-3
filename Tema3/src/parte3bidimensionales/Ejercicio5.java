package parte3bidimensionales;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tabla[][] = new int[4][5];
		int sumaF = 0;
		int sumaC = 0;
		int total = 0;

		Random rand = new Random();

		for (int filas = 0; filas < tabla.length; filas++) {
			sumaF = 0;
			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {

				tabla[filas][columnas] = rand.nextInt(100, 1000);
				sumaF += tabla[filas][columnas];

				System.out.print(tabla[filas][columnas] + "\t");
			}
			total += sumaF;
			System.out.print(sumaF);
			System.out.println("");
		}
		for (int columnas = 0; columnas < tabla.length + 1; columnas++) {
			sumaC=0;
			for (int contador = 0; contador < tabla.length; contador++) {

				sumaC += tabla[contador][columnas];
			}
			System.out.print(sumaC+"\t");
		}
		System.out.println(total);
	}

}
