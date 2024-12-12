package programaciónUd3;

import java.util.Scanner;

public class EjercicioJava17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicialización de la variable
        System.out.println("Jugador 1, introduzca la contraseña para comenzar el juego.");
        String con = sc.next();
        System.out.println("Jugador 2, introduzca la contraseña para comenzar el juego.");
        String con2 = sc.next();
        
        /* Comieno del programa
         * @param con.equals.(con2)
         * @param con.compareTo(con2)
         */
        while (!con.equals(con2)) {
        	  
            if (con.compareTo(con2) < 0) {
                System.out.println("La contraseña del jugador 2 nenor que la del jugador 1.");
            } else {
                System.out.println("La contraseña del jugador 2 mayor que la del jugador 1.");
            }
            // repetción de la contraseña del J2
            System.out.println("Jugador 2, ingrese la contraseña de nuevo:");
            con2 = sc.next();  
        }
        
        System.out.println("¡Acertaste!.");
    }
}
