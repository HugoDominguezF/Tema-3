package parte7strings;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char invertir[];
		
		String frase;
		
		String fraseInvertida="";
		
		System.out.println("Dime una frase y la invertire");
		frase = sc.nextLine();
		
		invertir = new char[frase.length()];
		
		for(int i=0;i<frase.length();i++) {
			
			invertir[frase.length()-i-1]=frase.charAt(i);
			
		}
		
		fraseInvertida=String.valueOf(invertir);
		
		System.out.println(fraseInvertida);
		
	}

}
