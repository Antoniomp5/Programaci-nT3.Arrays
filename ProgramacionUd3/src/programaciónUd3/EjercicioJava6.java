package programaciónUd3;

import java.util.Scanner;

public class EjercicioJava6 {
    public static void main(String[] arg) {
        // Crear el objeto Scanner
        Scanner sc = new Scanner(System.in);
        
        // Declarar un array de tipo double con 5 elementos
        double[] a = new double[5];
        
        // Solicitar al usuario que ingrese números para el array
        System.out.println("Introduzca números para crear el array.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();  // Asignar el valor al array en el índice i
        }
        
        // Imprimir los valores del array
        System.out.println("Los números introducidos son:");
        for (double e : a) {
            System.out.println(e);  
        }

        sc.close();
    }
}