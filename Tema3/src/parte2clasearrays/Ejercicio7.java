package parte2clasearrays;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int tabla[];
		int tamaño=0;
		
		for(int a=1;a<=10;a++) {
			tamaño+=a;
		}
		
		tabla=new int[tamaño];
		
		for(int a=1, b=0;a<=10;a++) {
			Arrays.fill(tabla, b, b+a, a);
			b+=a;
		}

		
		System.out.println(Arrays.toString(tabla));
	}

}
