package programaciónUd3;

public class EjercicioJava5 {
	public static void main (String[] args) {
		//Array
		int[] n = {5, 6, 4, 3, 2};
		
		//Invocación del metodo
		int suma = recogidaArray (n);
		
		//El resultado
		System.out.println("La suma total del array es: " + suma);
		
	}
	// Método para recoger la suma del array
	public static int recogidaArray(int[] array) {
	    // Uso del foreach
	    int suma = 0;
	    for (int n : array) {
	        suma = suma + n;
	    }
	    return suma;  // Devolver la suma calculada
	}
}
	



