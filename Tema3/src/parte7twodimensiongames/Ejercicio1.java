package parte7twodimensiongames;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		boolean ganar=true;

		String tabla[][] = { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-" } };

		String letra = "X";

		do {

			if (letra == "X") {

				letra = "O";

			} else {

				letra = "X";
			}

			System.out.println("Turno de el simbolo " + letra);

			imprimir(tabla);

			if ((tabla[2][2] == "X" && tabla[1][1] == "X" && tabla[0][0] == "X")
					|| (tabla[0][2] == "X" && tabla[1][1] == "X" && tabla[2][0] == "X")) {

				ganar=false;
			}

		} while (ganar);

	}

	static void imprimir(String tabla[][]) {
		for (int i = 0; i < tabla.length; i++) {

			System.out.print("\t");
			for(int j=0;j<tabla[0].length;j++) {
				
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println();
		}
	}
}
