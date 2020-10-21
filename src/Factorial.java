import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		int numero1 = input.nextInt();
		
		int factorial = 1;
		
		while (numero1 > 1) {
			factorial = factorial * numero1;
			--numero1;
		}
		System.out.println(" Es " + factorial);
	}

}
