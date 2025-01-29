package parte7strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String contraseña;
		
		String jug;
		
		
		
		System.out.println("Escribe la contraseña");
		contraseña= sc.nextLine();
		
		char letras[] = new char[contraseña.length()];
		
		Arrays.fill(letras, '*');
		
		System.out.println("Intenta acertar la contraseña");
		jug=sc.nextLine();
		
		
		while(!jug.equals(contraseña)) {
			
			for(int i=0;i<jug.length();i++) {
				
				if(contraseña.charAt(i)==jug.charAt(i)) {
					
					letras[i]=jug.charAt(i);
					
				}
			}
			
			System.out.println(String.valueOf(letras));
			
			System.out.println("Intenta acertar la contraseña");
			jug=sc.nextLine();
			
		}
		
		System.out.println("Has acertado!!");
		
		
	}

}
