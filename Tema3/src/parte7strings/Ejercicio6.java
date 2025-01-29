package parte7strings;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		String frase2="";
		
		System.out.println("Escribe una frase y te dire si es palindroma");
		frase = sc.nextLine();
		
		frase=frase.replace(" ", "");
		
		for(int i=0;i<frase.length();i++) {
			
			frase2+=frase.charAt(frase.length()-i-1);
			
		}
		
		if(frase.equals(frase2)) {
			System.out.println("Es palidroma");
		}else {
			System.out.println("NO es palidroma");
		}
	}

}
