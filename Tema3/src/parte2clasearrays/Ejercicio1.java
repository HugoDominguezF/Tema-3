package parte2clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamaño;
		int valor;
		
		int tabla[];
		
		System.out.println("Dime el tamaño del array");
		tamaño= sc.nextInt();
		
		System.out.println("Dime los valores");
		valor = sc.nextInt();
		
		tabla = new int[tamaño];
		Arrays.fill(tabla, valor);
		
		System.out.println(Arrays.toString(tabla));
		
		
		
		
		sc.close();
	}

}
