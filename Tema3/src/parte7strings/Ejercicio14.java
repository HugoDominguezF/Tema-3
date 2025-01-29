package parte7strings;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Dime una frase y te dire cuantas veces se repiten las letras");
		frase = sc.nextLine().toLowerCase();
		
		contador(frase);
		
		
	}

	static void contador(String frase) {
		
		char letra;
		
		int contador;
		
		int sig;
		
		frase=frase.replace(" ", "");
		
		while(!frase.isEmpty()) {
			
			contador=0;
			
			sig=1;
			
			letra = frase.charAt(0);
			
			while(sig>0) {
				
				sig=frase.indexOf(letra,sig)+1;
				
				contador++;
				
			}
			
			System.out.println(letra+" se repite "+contador+" veces");
			
			frase = frase.replace(letra,' ');
			
			frase=frase.replace(" ", "");
			
		}
	}
}
