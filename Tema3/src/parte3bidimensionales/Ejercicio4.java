package parte3bidimensionales;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tabla[][] = new int[10][10];
		int multiplicacion;

		for (int numero = 1; numero < tabla.length + 1; numero++) {
			for (int multiplo = 1; multiplo <= tabla.length; multiplo++) {
				multiplicacion = numero * multiplo;
				tabla[numero - 1][multiplo - 1] = multiplicacion;
			}
			for (int contador = 0; contador < tabla.length; contador++) {
				System.out.print(tabla[numero - 1][contador] + " ");
			}
			System.out.println("");
		}

	}

}
