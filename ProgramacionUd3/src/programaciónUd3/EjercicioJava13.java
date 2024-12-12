package programaciónUd3;

public class EjercicioJava13 {
	public static void main (String[] args) {
		
		int[] array1 = {1, 2, 3}; 
		int[] array2 = {1, 2, 3, 4}; 
		
		boolean res;
		res = comparaArray(array1, array2);
		
		System.out.println(res);
	}
	
	public static boolean comparaArray (int[] array1, int[] array2) {
		
		boolean resul = true;
		int i = 0;
		while (i < array1.length && resul) {
			if(array1[i] == array2[i]) {
				resul = false;	
			}
			i++;
		}
		return resul;
		
		
		
		
	}
	

}
