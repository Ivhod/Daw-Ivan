import java.util.Scanner;
public class BuclePrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero para saber si es primo"); //Para saber si es primo tiene que ser divisible
		int numero = input.nextInt();										// entre 1 y el mismo numero
		int divisor = 2;
		
		while(divisor<= (numero/2) && (numero%divisor !=0))
			divisor++;
		
		if (numero % divisor == 0)
			System.out.println(numero + "No es un numero primo");
		else
			System.out.println(numero + "Es un numero primo");
		}
		
	}


