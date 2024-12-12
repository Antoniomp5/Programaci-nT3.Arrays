package programaciónUd3;

public class EjercicioJava3 {
	public static void main (String[] args) {
		//Array
		double[] sueldo = {2325, 1250, 2040, 1980, 900};
		
		double porciento = 10;
		
		for (int i = 0; i < sueldo.length; i++) {
	           sueldo[i] += sueldo[i] * (porciento / 100);
	           System.out.println("\n");
	           System.out.println(sueldo);
		}
		
		
	}
}
