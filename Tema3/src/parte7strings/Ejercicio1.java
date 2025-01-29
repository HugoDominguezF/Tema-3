package parte7strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase1;
		String frase2;
		
		System.out.println("Introduce la primera frase");
		frase1= sc.nextLine();
		
		System.out.println("Introduce la segunda frase");
		frase2= sc.nextLine();
		
		if(frase1.length() == frase2.length()) {
			
			System.out.println("Son iguales");
			
		}else if(frase1.length() > frase2.length()) {
			System.out.println("La segunda frase es mas corta que la primera");
		}else {
			System.out.println("La primera frase es mas corta que la segunda");
		}
		
		
		
		
		
	}

}
