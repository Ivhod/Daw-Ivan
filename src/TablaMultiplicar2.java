import java.util.Scanner;

public class TablaMultiplicar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int numero;
		int inicio = 1;
		

		System.out.print("Introduce un número para mostrar su tabla de multiplicar ");
		numero = input.nextInt();

		System.out.println("Tabla del " + numero);
		int fin = numero;
		for (int calculonumero = inicio; calculonumero <= fin; calculonumero++) {
			

			for (int multiplo = 1; multiplo <= 10; multiplo++)
				System.out.println(calculonumero + " * " + multiplo + " = " + calculonumero* multiplo);
		}
	}
}
