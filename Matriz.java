import java.util.Scanner;

public class Matriz {

	public static void generarMatriz(int filas, int columnas, int[][] matriz) {

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				// GENERA NUMEROS ALEATORIOS DE 0 A 9
				matriz[i][j] = (int) (Math.random() * 9);
			}
		}
	}

	public static void imprimirMatriz(int filas, int columnas, int[][] matriz) {
		System.out.println("");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				// al mostrar las columnas dejo un espacio en blanco para poder leer comodamente
				// los numeros
				System.out.print(matriz[i][j] + " ");
			}
			// al finalizar cada fila añado un retorno de carro para ver bien la matriz
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("introduce el numero de filas: ");
		int filas = sc.nextInt();
		System.out.print("introduce el numero de columnas: ");
		int columnas = sc.nextInt();
		int[][] matriz = new int[filas][columnas];
		generarMatriz(filas, columnas, matriz);
		imprimirMatriz(filas, columnas, matriz);
	}
}
