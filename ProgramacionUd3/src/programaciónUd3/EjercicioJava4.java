package programaciónUd3;

public class EjercicioJava4 {
	public static void main (String[] args) {
		//Array
		int[] tabla = new int [10];
		int suma = 0; 
		
		for (int i = 0 ; i < tabla.length; i++) {
			tabla [i]  = (int) (Math.random()*100);
			suma = suma + tabla [i];	
		}
		System.out.println(suma);
		
	}
}
