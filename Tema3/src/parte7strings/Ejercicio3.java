package parte7strings;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String frase;

		int espacios = 0;
		
		int lugar=0;
		
		System.out.println("Escribe una frase y dire cuantos espacios tiene");
		frase=sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			lugar=frase.indexOf(" ", i);
			
			if (lugar > 0) {
				espacios += 1;
				i = lugar + 1;

			}

		}

		System.out.println("En la frase hay " + espacios + " espacios");

	}

}
