package parte7strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase1;

		String frase2;

		boolean anagrama;

		System.out.println("Escribe dos palabras/frases y te dire si son un anagrama");
		frase1 = sc.nextLine();

		System.out.println("Siguiente palabra/frase:");
		frase2 = sc.nextLine();

		anagrama = anagrama(frase1, frase2);

		if (anagrama) {
			System.out.println("Las palabras/frase son anagramas");

		} else {
			System.out.println("NO son anagramas");
		}
	}

	static boolean anagrama(String frase1, String frase2) {

		boolean iguales=false;
		
		char tabla1[] = frase1.replace(" ", "").toLowerCase().toCharArray();

		char tabla2[] = frase2.replace(" ", "").toLowerCase().toCharArray();

		Arrays.sort(tabla1);

		Arrays.sort(tabla2);

		if (Arrays.equals(tabla1, tabla2)) {

			iguales = true;

		}
		
		return iguales;
	}
}
