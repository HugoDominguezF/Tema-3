package parte7strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		char letras[];
		
		System.out.println("Escribe una frase y la ordenare alfabeticamente");
		frase = sc.nextLine();
		
		frase=frase.replace(" ", "");
		
		letras = frase.toCharArray();
		
		Arrays.sort(letras);
		
		for(int i=0;i<letras.length;i++) {
			
			System.out.print(letras[i]+" ");
		
		}
		
		
		
		
	}

}
