import java.util.Scanner;

public class Sumatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce n�meros hasta que teclees el cero:  ");

		int numero1 = input.nextInt();

		int resultado =0 ;

		while (numero1!=0) {
			resultado += numero1;
			System.out.println("Introduzca otro numero para seguir la sumatoria");
			numero1 = input.nextInt();
		}
		System.out.println(" Es " + resultado);
	}

}
