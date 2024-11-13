package parte2clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int sorteo[] = new int [6];
		
		int resultado[] = {3, 8, 12, 34, 43, 48};
		int buscar;
		int a=0;
		int num;
		int aciertos=0;
		
		Random rand=new Random();
		
		while(a<6) {
			
			num=rand.nextInt(1,50);
			
			Arrays.sort(sorteo);
			buscar=Arrays.binarySearch(sorteo, num);
			if(buscar<0) {
				sorteo[0]=num;
				a++;
			}
			
			
		}
		for(int valor : sorteo) {
			buscar=Arrays.binarySearch(resultado, valor);
			if(buscar>=0) {
				aciertos++;
			}
		}

		System.out.println("Aciertos "+aciertos);
		System.out.println("Sorteo "+Arrays.toString(sorteo));
		System.out.println("Resultado "+Arrays.toString(resultado));
	}

}
