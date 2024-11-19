package parte4funciones;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tablaUsuario[]= {1,2,3,4,6,5};
		
		int maximo= maximo(tablaUsuario);
		
		System.out.println(maximo);
		
	}

	static int maximo(int tablaUsuario[]) {
		
		int tabla[] = Arrays.copyOf(tablaUsuario, tablaUsuario.length);
		
		Arrays.sort(tabla);
		
		return(tabla[tabla.length-1]);
		
	}
}
