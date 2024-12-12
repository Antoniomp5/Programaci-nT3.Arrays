package programaciónUd3;

import java.util.Scanner;

public class EjerciciosJava16 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaración de variables 
		System.out.println("Introduzca las 2 frases");
		String var1 = sc.nextLine();
		String var2 = sc.nextLine();
		
		/* Ejecución del programa 
		 * @param var1.lenght()
		 * @param var2.lenght()
		 * */
		 
		if (var1.length() < var2.length()){
			System.out.println("La primera frase es la más corta");
		} else {
			System.out.println("La segunda frase es la más corta");
		}
		
		
		
		
	}

}
