package parte7strings;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		
		char frase2[];

		char letra;

		String frase;

		System.out.println("Escribe una frase y la codificare");
		frase = sc.nextLine();

		frase2 = new char[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			
			letra=frase.toLowerCase().charAt(i);
			
			frase2[i]=codifica(conjunto1, conjunto2, letra);
			
		}
		System.out.println(String.valueOf(frase2));

	}

	static char codifica(char conjunto1[], char conjunto2[], char letra) {
		
		boolean encontrada=false;
		
		int contador=0;
		
		do {
			
			if(letra==conjunto2[contador]) {
				
				letra=conjunto1[contador];
				encontrada=true;
			}
			
			contador+=1;
			
		}while(!encontrada && contador<conjunto1.length);
		
		return letra;

	}

}

