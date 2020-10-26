import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int numero;
		
		System.out.print("Introduce un número para mostrar su tabla de multiplicar ");
		numero = input.nextInt();
		
		System.out.println("Tabla del " + numero);
		
		for (int multiplo = 1; multiplo <= 10; multiplo++) {
			System.out.println(numero + " * " + multiplo + " = " + numero * multiplo);
		}
	}

}
