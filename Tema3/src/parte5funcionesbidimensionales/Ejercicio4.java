package parte5funcionesbidimensionales;

public class Ejercicio4 {

	public static void main(String[] args) {

		int tabla[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		boolean magica;

		magica = esMagica(tabla);

		if (magica) {
			System.out.println("La tabla es magica");
		} else {
			System.out.println("La tabla NO es magica");
		}

	}

	static boolean esMagica(int tabla[][]) {

		int tablaL[] = new int[tabla.length];

		int tablaC[] = new int[tabla.length];

		int num = 0;

		boolean verificar = true;

		for (int linea = 0; linea < tabla.length; linea++) {
			
				for (int columna = 0; columna < tabla[0].length; columna++) {

					tablaL[columna] = tabla[linea][columna];
					tablaC[columna] = tabla[columna][linea];

					if (linea == 0) {
						num += tablaL[columna];
					}
				}
				verificar = resultado(tablaL, tablaC, num);
		}

		return verificar;
	}

	static boolean resultado(int tablaL[], int tablaC[], int num) {

		boolean igual = true;

		int sumaL = 0;
		int sumaC = 0;

		for (int contador = 0; contador < tablaL.length; contador++) {

			sumaL += tablaL[contador];
			sumaC += tablaC[contador];

			if (sumaL == num && sumaC == num) {

				igual = true;

			} else {
				igual = false;
			}

		}

		return igual;
	}
}
