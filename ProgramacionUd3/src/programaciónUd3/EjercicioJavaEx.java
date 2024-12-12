package programaciónUd3;

public class EjercicioJavaEx {
	public static void main (String[] args) {
		//Array
		int[] n = {5, 6, 4, 3, 2};
		
		System.out.print("{");
		for (int i = 0 ; i <n.length; i++) {
			System.out.print(n[i]);
		}
		System.out.print("}");
		
		for (int e: n) {
			System.err.println(e);
		}
		
	}
}
