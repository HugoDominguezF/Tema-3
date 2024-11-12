package parte2clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		
		int respuesta;
		
		for(int contador=0;contador<20;contador++) {
			System.out.println("Introduce un valor");
			respuesta=sc.nextInt();
			
			if(contador<10) {
				tabla1[contador]=respuesta;
			}else {
				tabla2[contador-10]=respuesta;
			}
		}
		
		if(Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales");
		}else {
			System.out.println("No son iguales las tablas");
		}
	sc.close();
	}

}
