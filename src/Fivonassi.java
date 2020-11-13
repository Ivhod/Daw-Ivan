import java.util.Scanner;

public class Fivonassi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Calculemos la serie Fibonacci a partir del numeo elegido");
		int numero = input.nextInt();
		System.out.println(" Tu numero " + fibonacci(numero));
	}
	public static int fibonacci(int numero){
		int primero = 0;
		int segundo = 1;
		if (numero==1) return 0;
		if (numero == 2) return 1;
		int tercero= 0;
		
		for (int i = 3; i <= numero; i++) {
			tercero = primero + segundo;
			primero = segundo;
			segundo = tercero;
		}
		
		return tercero;
	}

}
