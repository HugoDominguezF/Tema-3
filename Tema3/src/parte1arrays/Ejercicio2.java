package parte1arrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * Creamos la variable respuesta para almacenar los numeros que nos da el
		 * usuario
		 */
		double respuesta = 0;

		// Creamos una tabla de maximo 5 y de tipo double ya que necesitamos decimales
		double tabla[] = new double[5];

		// Creamos un scanner para leer los numero que nos pone el usuario
		Scanner sc = new Scanner(System.in);

		/*
		 * Creamos un bucle que preguntara al usuario cada numero de la tabla, despues
		 * almacenamos las respuestas y volvemos a preguntar
		 */
		for (int contador = 0; contador < tabla.length; contador++) {
			System.out.println("Dime el siguiente numero de la tabla");
			respuesta = sc.nextDouble();
			tabla[contador] = respuesta;
		}

		// Imprimimos los numero de la tabla en un bucle de longitud igual a la tabla
		for (double numeros : tabla) {
			System.out.print(numeros + " ");
		}
		// Cerramos el scanner
		sc.close();
	}

}
