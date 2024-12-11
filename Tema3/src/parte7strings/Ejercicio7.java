package parte7strings;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		String palabra;
		
		int repetir=0;
		
		int pos;
		
		System.out.println("Escribe una frase completa");
		frase= sc.nextLine();
		
		System.out.println("Escribe una palabra y te dire cuantas veces se repite");
		palabra=sc.nextLine();
		
		pos=frase.indexOf(palabra);
		
		while(pos>=0) {
			
			repetir++;
			pos=frase.indexOf(palabra, pos+1);
			
		}
		
		System.out.println("La palabra "+palabra+" se repite "+repetir+" veces");
		
		
	}

}
