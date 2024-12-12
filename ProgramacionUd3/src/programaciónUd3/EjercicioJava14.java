package programaciónUd3;

import java.util.Arrays;

/**
 * 
 */
public class EjercicioJava14 {
	public static void main (String[] args) {
		//Todo copiar el array origina al destino
		
		//Array original
		int[] original = {18,21,19,18,20};
		//Creo array destino on el mismo tamaño que el original.
		
		int[] destino = new int[original.length];
		
		for(int i = 0; i < original.length; i++){
			destino[i] = original[i];
		}
		
		System.out.println(Arrays.toString(destino));
		
		EjercicioJava13.comparaArray(original, destino);

	}
	
}
