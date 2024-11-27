package parte6extras;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] tabla = new int[8][8];
		
		char ficha;
		
		int x;
		
		int y;
		
		System.out.println("Elige tu ficha");
		ficha=sc.next().toUpperCase().charAt(0);
		
		System.out.println("Elige la fila inicial (Coordenada Y)");
		y=sc.nextInt();
		
		System.out.println("Elige la columna inicial (Coordenada X)");  
		x=sc.nextInt();
		
		switch(ficha){
		
		case 'A' -> arfil(tabla);
		
		case 'T' ->System.out.println();
		
		case 'D' ->System.out.println();
		
		case 'C' ->System.out.println();
		
		
		}
		
	} 
	static char[][] arfil(int[][] tabla){
		
		char tabla2[][] = new char[tabla.length][tabla[0].length];
		
		for(int i=0;i<tabla2.length;i++) {
			for(int j=0;j<tabla[0].length;j++) {
				tabla2[i][j]=' ';
			}
		}
		
		for(int i=0;i<tabla2.length;i++) {
			
				System.out.print(Arrays.toString(tabla2[i]));
		
			System.out.println();
		}
		
		return tabla2;
		
	}
}
