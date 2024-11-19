package parte4funciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int clave;
		int respuesta;
		
		
		int tabla[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Que numero quieres buscar en la tabla");
		clave=sc.nextInt();
		
		respuesta=buscar(tabla, clave);
		
		System.out.println(respuesta);
		
		sc.close();
	}

	static  int buscar(int tabla[], int clave) {
		
		int num = 0;
		boolean noEsta = true;
		
		for(int contador=0;contador<tabla.length;contador++) {
			
			if(clave==tabla[contador]) {
				
				num=contador+1;
				
				noEsta=false;
				
				contador=tabla.length;
			}
		}
		
		if(noEsta) {
			
			num=-1;
		}
		
		return(num);
	}
}
