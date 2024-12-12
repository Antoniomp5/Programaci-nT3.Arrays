package programaciónUd3;

public class EjemploString {
	public static void main (String[] args) {
		
		//Todo Auto-generated method
		
		System.out.println("Hola ªªªªª: \u279b");
		System.out.println("Hola \"Anto\tnio\"");
		System.out.println("Hola \"Antonio\"\r");
		
		//Convertir
		int i = 65;
		char c = (char)i;
		System.out.println(c);
		
		char d = 'A';
		int e = d;
		System.out.println(e);
		
		//Convertir int a Strnig
		int j = 123;
		String s = String.valueOf(j);
		
		//Comparar cadenas
		
		String cad1 = "hola";
		String cad2 = "hola";
		System.out.println(cad1 == cad2);
		
		System.out.println(cad1.equals(cad2));
		
		//Probar metodos complateTo
		int comparacion;
		//Cadenas iguales
		comparacion = "hola".compareTo("hola");
		//Cadena invocante menor
		comparacion = "caca".compareTo("paca");
		//Cadena invocante mayor
		comparacion = "paca".compareTo("caca");
		
		if (comparacion == 0) {
			System.out.println("Son iguales");
			} else if (comparacion < 0) {
				System.out.println("Primer mayor");
			} else if (comparacion > 0) {
				System.out.println("Primer menor");
			}
	
		int pos = "Hola Antonio".indexOf("Antonio");
		System.out.println(pos);
	}
	

}
