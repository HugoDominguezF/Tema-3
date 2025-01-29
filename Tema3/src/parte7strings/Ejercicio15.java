package parte7strings;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Jugador 1 introduzca la palabra/frase para que el jugador 2 adivine");
		frase=sc.nextLine();
		
		desordenar(frase);
		
	}

	static void desordenar(String frase) {
		
		Random rand = new Random();
		
		String tabla[] = frase.split(" ");
		
		String desordenado[] = new String[frase.length()];
		
		char palabra[];
		
		int aleatorio;
		
		for(int i=0;i<tabla.length;i++) {
			
			if(tabla[i] != " ") {
			palabra = new char[tabla[i].length()];
			
			Arrays.fill(palabra, '-');
			
			for(int j=0; j<tabla[i].length();j++) {
			do {
				
				aleatorio = rand.nextInt(0,tabla[i].length());
				
			}while(palabra[aleatorio] != '-');
			
			palabra[aleatorio] = tabla[i].charAt(j);
			}
			
			System.out.print(palabra);
			System.out.print(" ");
			}
			
		}
		
		
	}
}
