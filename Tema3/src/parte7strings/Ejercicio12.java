package parte7strings;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max=0;
		
		int lugar=0;
		
		String frase;
		
		System.out.println("Escribe una frase y dire cual palabra es la mas grande");
		frase = sc.nextLine();
		
		String[] palabras = frase.split(" ");
		
		for(int i=0;i<palabras.length;i++) {
			
			if(palabras[i].length()>max) {
				
				lugar=i;
				max=palabras[i].length();
				
			}
			
		}
		
		System.out.println("La palabra mas larga es "+palabras[lugar]+" con un total de "+max+" letras");
		
	}

}
