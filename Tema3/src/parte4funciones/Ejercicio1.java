package parte4funciones;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tabla[] = { 1, 1, 1, 1, 1, 1 };

		int suma = sumaTabla(tabla);

		System.out.println(suma);

	}

	static int sumaTabla(int tabla[]) {
		
		int suma=0;
		for(int valor : tabla) {
			suma+=valor;
		}
		
		return (suma);
	}
}
