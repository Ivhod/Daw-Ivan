import java.util.Scanner;

public class PreguntasBucle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int numeropreguntas = 5; // Numero de preguntas, para saber cuantas veces tiene que repetirlo
		int contadorpreguntas = 0;
		Scanner input = new Scanner(System.in);

		while (contadorpreguntas < numeropreguntas) { //

			int numero1 = (int) (Math.random() * 10);
			int numero2 = (int) (Math.random() * 10);

			if (numero1 < numero2) { // Esto cambia la formula de la resta por si el primer numero es mas bajo que el
										// segundo
				int cambioresta = numero1;
				numero1 = numero2;
				numero2 = cambioresta;
			}
			System.out.print("Cuanto es " + numero1 + " - " + numero2 + " ? ");
			int resultado = input.nextInt();
			while(numero1 - numero2 != resultado) {
				System.out.println("El resultado esta mal vuelve a introducir el resultado");
				resultado = input.nextInt();
				
			}
			contadorpreguntas++;	
		}
		System.out.println(" Has acertado todas ");
	}

}
