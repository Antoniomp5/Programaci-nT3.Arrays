package programaciónUd3;

import java.util.Scanner;

public class EjercicioJava18 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String f = sc.nextLine();
		char c;
		int cont = 0;
		
		for (int i = 0; i < args.length; i++) {
			c = f.charAt(i);
			if (c == ' ') {
				cont++;
			}
		}
		System.out.println(cont);
	} 

}
