import java.util.Random;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Vamos a jugar al Ahorcado ");
		System.out.println(" Se generara una Palabra aleatoria y tendras que aceptarlas");

		String palabra;
		String[] diccionario = new String[] { "perro", "mando", "juntar", "portatil", "movil", "cajon" };
		palabra = diccionario[(int) (Math.random() * 6)]; // Esto es coger un palabra aleatoria

		int fallos = 0;
		System.out.println(palabra);
		char[] guiones = mostrarguiones(palabra);
		System.out.println(guiones);

	}

	public static char[] mostrarguiones(String palabra) {
		int letrasPalabras = palabra.length(); // letras de la palabra oculta
		char[] guiones = new char[letrasPalabras];

		for (int i = 0; i < guiones.length; i++) { //Para que ponga guiones por el tamaño de la palabra
			guiones[i] = '_';
		}
		return guiones;
	}
}
