import java.util.Scanner;

public class SumaBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = (int) (Math.random() * 10);
		int numero2 = (int) (Math.random() * 10);
		int fallo = 0;

		Scanner input = new Scanner(System.in);

		System.out.println(" ¿Cuanto es " + numero1 + " + " + numero2 + "?");

		int resultado = input.nextInt();
		int suma = numero1 + numero2;

		while (suma != resultado) {
			System.out.println("Resultado mal, Introduce el resultado de nuevo");
			resultado = input.nextInt();
			fallo++;
		}
		System.out.println("Has acertado, Has fallado " + fallo + "veces");
	}

}
