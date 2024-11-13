package parte3bidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double tabla[][] = new double[4][5];

		double respuesta;
		double media;
		double suma = 0;

		for (int alumno = 0; alumno < 4; alumno++) {

			System.out.println("Alumno " + (alumno + 1) + " introduzca sus notas");

			for (int notas = 0; notas <= tabla.length; notas++) {
				respuesta = sc.nextDouble();
				tabla[alumno][notas] = respuesta;
			}
		}

		System.out.println("\t\tNota1\tNota2\tNota3\tNota4\tNota5\tNotaMedia  NotaMax      NotaMin");

		for (int linea = 0; linea < tabla.length; linea++) {
			media = 0;
			suma = 0;
			System.out.print("Alumno " + (linea + 1) + "	");

			for (int notas = 0; notas < 5; notas++) {
				System.out.print(tabla[linea][notas] + "\t");
				suma += tabla[linea][notas];

			}

			media = suma / 5;
			System.out.print(+media);

			Arrays.sort(tabla[linea]);

			System.out.print("  	   " + tabla[linea][4]);
			System.out.println("\t\t" + tabla[linea][0]);
		
		}
		sc.close();
	}

}
