import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ||Vamos a jugar al Ahorcado|| ");
		System.out.println(" Se generara una Palabra aleatoria y tendras que descubrirla.");

		String palabra;
		String[] diccionario = new String[] { "perro", "mando", "juntar", "portatil", "movil", "cajon" };
		palabra = diccionario[(int) (Math.random() * 6)]; // Esto es coger un palabra aleatoria

		int fallos = 0;
		System.out.println(palabra);
		char[] guiones = mostrarguiones(palabra);
		boolean JuegoTerminado = false;
		Scanner input = new Scanner(System.in);
		do {

			System.out.println(guiones);
			System.out.println("Tienes " + fallos + " fallos ");
			System.out.println("Introduce una letra para comprobar si esta en la palabra");
			char letra = input.next().charAt(0);

			boolean letraAcertada = false;
			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) == letra) {
					guiones[i] = letra;
					letraAcertada = true;

				}

			}
			if (!letraAcertada) {
				System.out.println(" La letra " + letra + " no esta en la palabra");
				fallos++;
				if (fallos == 6) {
					System.out.println("Has perdido porque has llegado al maximo de fallos y eres un inutil");
					System.out.println("La palabra era " + palabra + " aprende a leer anda");
					JuegoTerminado = true;
				}
			} else {
				boolean ganar = !hayGuiones(guiones);
				if (ganar) {
					System.out.println("Has ganado la palabra era " + palabra);
					JuegoTerminado = true;
				}
			}

		} while (!JuegoTerminado);

	}

	public static char[] mostrarguiones(String palabra) {
		int letrasPalabras = palabra.length(); // letras de la palabra oculta
		char[] guiones = new char[letrasPalabras];

		for (int i = 0; i < guiones.length; i++) {
			guiones[i] = '-';
		}
		return guiones;
	}

	public static boolean hayGuiones(char[] array) { // Comprobar si quedan guiones en la palabra si no hay terminamos
														// el juego
		for (char l : array) {
			if (l == '-')
				return true;
		}
		return false;
	}
}
