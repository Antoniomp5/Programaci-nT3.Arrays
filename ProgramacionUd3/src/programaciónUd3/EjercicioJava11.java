package programaciónUd3;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioJava11 {
	public static void main(String[] arg) {
		// Declaraciones
				Scanner sc = new Scanner(System.in);
				int n;
				int resultado;

				// Crear array de 5 enteros
				int[] a = new int[5];

				// Inicializar el array con número aleatorios
				// invocando al un método o directamente aquí
				inicializaArrayAleatorio(a);
				System.out.println(Arrays.toString(a));

				// Invocar al método de búsqueda
				n = sc.nextInt();
				resultado = busquedaLineal(n, a);

				// Imprmir resultado
				imprimir(resultado);

				// Invocar búsqueda binaria de la clase java.util.Arrays
				resultado = java.util.Arrays.binarySearch(a, n);

				imprimir(resultado);
				
			}

			/**
			 * Imprime el resultado
			 * @param resultado
			 */
			private static void imprimir(int resultado) {
				if (resultado == -1)
					System.out.println("No encontrado");
				else {
					System.out.println("Econtrado en posición: " + resultado);
				}
			}

			public static int busquedaLineal(int n, int[] a) {
				for (int i = 0; i < a.length; i++) {
					if (a[i] == n)
						return i;
				}
				return -1;
			}

			public static void inicializaArrayAleatorio(int[] a) {
				for (int i = 0; i < a.length; i++) {
					a[i] = (int) (Math.random() * 100) + 1;
				}
			}
	
}
