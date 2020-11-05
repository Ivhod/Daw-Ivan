import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		int numero;
		int numero1;
		
		Scanner input = new Scanner(System.in);

		do {		// Esto es un do while para el menu con cada opcion del menu
			op = menu();
			switch (op) {															//Cada caso es cada opcion y lo que hace cada una de las opciones del programa
			case 1:
				System.out.println(" Introduce un numero para comprobar si es primo o no ");
				numero = input.nextInt();
				if (esprimo(numero))
					System.out.println("El numero " + numero + " es primo ");
				else
					System.out.println("El numero " + numero + " no es primo");
				break;

			case 2:
				System.out.println("Introduce un numero para comprobar si es par o no ");
				numero = input.nextInt();
				if (espar(numero))
					System.out.println(" El numero " + numero + " es par");
				else
					System.out.println(" El numero " + numero + " no es par");
				break;
			case 3:
				System.out.println(" Introduce 2 numeros para comprobar su minimo comun divisor ");
				System.out.println(" Numero 1 ");
				numero = input.nextInt();
				System.out.println(" Numero 2 ");
				numero1 = input.nextInt();

				System.out.println(
						" El minimo comun divisor de " + numero + " y " + numero1 + " es " + GCD(numero, numero1));
				break;
			case 4:
				System.out.println("Introduce un numero decimal para pasarlo a hexadecimal");
				numero = input.nextInt();

				System.out.println(numero + " = " + hexadecimal(numero));
			case 5:
				System.out.println("Introduce un numero Hexadecimal para pasarlo a decimal");
				String hex = input.next();
				
				System.out.println(hex + " = " + decimalhex(hex));

			}
		} while (op != 6); // Esto es para saber que solo hay 5 opciones si queremos mas opciones cambiamos el valor y añadimos mas casos en el switch
	}
	public static int decimalhex (String hex) {
		int decimal= 0;
		hex.length();
		int high = hex.length()-1;
		for (int i = 0; i <= high; i++) {
			char caracter = hex.charAt(i);
			int digit;
			
			if (caracter >= '0' && caracter <= '9')
				digit = caracter - 'A' + 10;
			else if (caracter >= 'A' && caracter <= 'F')
				digit = caracter = 'A' + 10;
			else
				return 0;
			
			decimal += digit*Math.pow(16, high-i);
		}
		return decimal;
		
		
		
	}
	public static String hexadecimal(int decimal) { 		//Esto es cada ejercicio basicamente meter los anteriores ejercicios que hemos echo en diferentes metodos
		String hex = "";
	    
	    while (decimal != 0) {
	      int hexvalor = decimal % 16; 
	    
	      // Convert a decimal value to a hex digit 
	      char hexnumero;
	      if (0 <= hexvalor && hexvalor <= 9) {
	    	   hexnumero = (char)(hexvalor + '0');
	          
	      
	      }
	      else
	    	  hexnumero = (char)(hexvalor - 10 + 'A');
	   /*   char hexDigit = (0 <= hexValue && hexValue <= 9) ?
	        (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');*/
	     
	      hex = hexnumero + hex;
	      
	      decimal = decimal / 16;
	    }
	    
	    return hex;
	
	}
	public static int GCD ( int numero1, int numero2) { 		//Minimo comun divisor
		int divisor = (numero1<numero2)?numero1:numero2;
		while (numero1% divisor !=0 || numero2 % divisor !=0)
			divisor--;
		return divisor;	
	}
	public static boolean espar (int numero) { 		//Par o impar
		if (numero % 2 == 0 ) 
			return true;
		return false;
	}
	public static boolean esprimo (int numero) {  	//Primo o no
		int divisor = 2;

		while (divisor < (numero / 2) && (numero % divisor != 0))
			divisor++;
		if (numero % divisor != 0 || numero == 2) 
			return true;								//Esto es lo mismo que poner else y la condicion
		return false;
	}

	public static int menu() { // este es el menu del programa 
		int opciones;
		Scanner input = new Scanner(System.in);
		System.out.println(" Menu ");
		System.out.println(" 1-Es primo o no  ");
		System.out.println(" 2-Es par o impar ");
		System.out.println(" 3-Minimo Comun Divisor ");
		System.out.println(" 4-Decimal a Hexadecimal");
		System.out.println(" 5-Hexadecimal a Decimal ");
		System.out.println(" 6-Exit ");

		opciones = input.nextInt();
		return opciones;
	}
}
