package parte7strings;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palabra;

		String frase = "";

		int espacio;

		System.out.println("Escribe palabras infinitamente, escribe fin para que acabe");
		palabra = sc.nextLine();

		espacio = palabra.indexOf(" ");

		if (espacio > 0) {

			palabra = palabra.substring(0, espacio);

		}

		while (!palabra.equalsIgnoreCase("fin")) {

			frase += palabra + " ";

			System.out.println("Siguiente palabra:");
			palabra = sc.nextLine();

			espacio = palabra.indexOf(" ");

			if (espacio > 0) {

				palabra = palabra.substring(0, espacio);

			}

		}

		System.out.println(frase);

	}

}
