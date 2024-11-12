package parte2clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int tabla[] = new int[30];
		
		Random rand= new Random();
		
		for (int contador=0 ;contador<30;contador++) {
			tabla[contador]= rand.nextInt(1,10);
		}
		
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
		
	}

}
