import java.util.Scanner;

public class MinimoComunDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el primer digito");
		int numero1 = input.nextInt();
		
		System.out.println("Introduce el segundo digito");
		int numero2 = input.nextInt();
		
		int divisor = numero1<numero2 ? numero1:numero2; // Si el numero1 es menor que el numero2 si no es el numero2 
																	//es lo mismo que if (numero1 < numero2)
																						//divisor = numero1
		while (numero1 % divisor != 0 || numero2 % divisor !=0) {						//else divisor = numero2
			divisor--;
			
		}
		System.out.println("Minimo Comun Divisor de " + numero1 + " y " + numero2 + " es " + divisor );
	}

}
