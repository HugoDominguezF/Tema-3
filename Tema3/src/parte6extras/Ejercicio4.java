package parte6extras;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] tabla = new String[8][8];

		char ficha;

		int x;

		int y;

		System.out.println("Elige tu ficha");
		ficha = sc.next().toUpperCase().charAt(0);

		System.out.println("Elige la fila inicial (Coordenada Y)");
		y = sc.nextInt();

		System.out.println("Elige la columna inicial (Coordenada X)");
		x = sc.nextInt();

		switch (ficha) {

		case 'A' -> arfil(tabla, x, y);

		case 'T' -> torre(tabla, x, y);

		case 'D' -> dama(tabla, x, y);

		case 'C' -> System.out.println();

		}

	}

	static String[][] torre(String[][] tabla, int x, int y) {

		String tabla2[][] = new String[tabla.length][tabla[0].length];

		tabla2=llenar(tabla2,x,y);
		
			for(int j=0;j<tabla.length;j++) {
				tabla2[x][j]= "X";
				tabla2[j][y]= "X";		
			}
			
		tabla2[x][y]="T";

		imprimir(tabla2);
		
		return tabla2;

	}
	static String[][] arfil(String[][] tabla, int x, int y) {

		boolean fin = false;

		int x2 = x;

		int y2 = y;

		String tabla2[][] = new String[tabla.length][tabla[0].length];

		tabla2=llenar(tabla2, x, y);

		for (int i = 0; i < 4; i++) {
			x2 = x;
			y2 = y;
			fin = false;
			for (int j = 0; j < tabla[0].length && !fin; j++) {

				switch (i) {

				case 0 -> {
					x2 = x2 + 1;
					y2 = y2 + 1;
				}

				case 1 -> {
					x2 = x2 + 1;
					y2 = y2 - 1;
				}

				case 2 -> {
					x2 = x2 - 1;
					y2 = y2 + 1;
				}

				case 3 -> {
					x2 = x2 - 1;
					y2 = y2 - 1;
				}
				}

				if (x2 < 0 || y2 < 0 || x2 >= tabla.length || y2 >= tabla.length) {
					fin = true;
				} else {
					tabla2[x2][y2] = "X";
				}

			}
		}
		tabla2[x][y]="A";
		
		imprimir(tabla2);

		return tabla2;

	}
	static String[][] dama(String[][] tabla, int x, int y){
		
		String tabla2[][] = new String[tabla.length][tabla[0].length];
	
		boolean fin = false;
		int x2 = x;
		int y2 = y;

		tabla2=llenar(tabla2,x,y);
		
		for(int j=0;j<tabla.length;j++) {
			tabla2[x][j]= "X";
			tabla2[j][y]= "X";		
		}

		for (int i = 0; i < 4; i++) {
			x2 = x;
			y2 = y;
			fin = false;
			for (int j = 0; j < tabla[0].length && !fin; j++) {

				switch (i) {

				case 0 -> {
					x2 = x2 + 1;
					y2 = y2 + 1;
				}

				case 1 -> {
					x2 = x2 + 1;
					y2 = y2 - 1;
				}

				case 2 -> {
					x2 = x2 - 1;
					y2 = y2 + 1;
				}

				case 3 -> {
					x2 = x2 - 1;
					y2 = y2 - 1;
				}
				}

				if (x2 < 0 || y2 < 0 || x2 >= tabla.length || y2 >= tabla.length) {
					fin = true;
				} else {
					tabla2[x2][y2] = "X";
				}

			}
		}
		
		tabla2[x][y]="D";
		
		imprimir(tabla2);
		
		return tabla2;
	}
	static String[][] llenar(String[][] tabla2, int x, int y) {

		for (int i = 0; i < tabla2.length; i++) {
			for (int j = 0; j < tabla2[0].length; j++) {
				tabla2[i][j] = " ";
			}
		}
		
		return tabla2;
	}
	static void imprimir(String[][] tabla2) {
		
		for (int i = 0; i < tabla2.length; i++) {

			System.out.print(Arrays.toString(tabla2[i]));

			System.out.println();
		}
	}
}
