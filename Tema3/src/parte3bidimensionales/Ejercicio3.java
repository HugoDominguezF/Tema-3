package parte3bidimensionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int largo;
		int ancho;
		
		System.out.println("Dime el tamaño de largo de la tabla");
		largo=sc.nextInt();
		System.out.println("Dime el tamaño de ancho de la tabla");
		ancho=sc.nextInt();
		
		int tabla[][]=new int[ancho][largo];
		
		for(int i=0;i<ancho;i++) {
			for(int j=0;j<largo;j++) {
				tabla[i][j]=10*i+j;
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
