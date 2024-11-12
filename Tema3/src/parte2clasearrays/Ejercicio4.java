package parte2clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla[]=new int[8];
		int resultados[]=new int[8];
		
		int puntuacion;
		
		for(int contador=0;contador<8;contador++) {
		System.out.println("Introduzca su puntuacion de 1000 a 2800");
		puntuacion=sc.nextInt();
		
		tabla[contador]=puntuacion;
		
		}
		Arrays.sort(tabla);
		for(int contador=0, contadorRev=7;contador<8;contador++, contadorRev--) {
			
			resultados[contador] = tabla[contadorRev];
			
			}
		System.out.println("Los resultados son: "+ Arrays.toString(resultados));
		
		sc.close();
	}

}
