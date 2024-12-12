package programaciónUd3;

import java.util.Scanner;

public class EjercicioJava7 {
	public static void main(String[] arg) {
        // Crear el objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Declarar un array de tipo int con 5 elementos
        int[] a = new int[5];
        
        // Solicitar al usuario que ingrese números para el array
        System.out.println("Introduzca números para crear el array.");
        for (int i = 4; i >= 0 ; i--) {
            a[i] = sc.nextInt();  // Asignar el valor al array en el índice i
        }
        
        // Imprimir los valores del array
        System.out.println("Los números introducidos son:");
        for (int e : a) {
            System.out.println(e);  
        }


        sc.close();
    }
}
