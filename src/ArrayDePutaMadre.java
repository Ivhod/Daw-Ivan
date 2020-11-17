import java.util.Random;
import java.util.Scanner;

public class ArrayDePutaMadre {

	public static void main(String[] args) {
		Random rgen = new Random();
		int[] miArray = new int[12];
		int op;
		do {
			Scanner input = new Scanner(System.in);
			op = menu();
			switch (op) {
			case 1:
				System.out.println(" Introduce 12 numeros para rellenar el array ");
				for (int i = 0; i < 12; i++) {
					miArray[i] = input.nextInt();
				}
				break;
			case 2:
				for (int i = 0; i < 12; i++) {
					miArray[i] = rgen.nextInt(21);
				}
				break;
			case 3:
				String s = "";
				for (int i = 0; i < 12; i++) {
					s += "|" + miArray[i] + "|";
				}
				System.out.println(" ARRAY");
				System.out.println(" --------------");
				System.out.println(s);
				break;
			case 4:
				System.out.println(suma(miArray));
				break;
			case 5:
				System.out.println(mayor(miArray));
				break;
			case 6:
				System.out.println(menor(miArray));
				break;
			case 7:
				miArray = barajar(miArray);
				break;

			}
		} while (op != 8);

		System.out.println(" FIN DEL PROGRAMA ");

	}

	public static int menu() {

		Scanner input = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("| MENU |");
		System.out.println("--------");
		System.out.println(" 1. Rellenar array manualmente ");
		System.out.println(" 2. Rellenar array aleatoriamente ");
		System.out.println(" 3. Mostrar el array ");
		System.out.println(" 4. Sumar los elementos del array ");
		System.out.println(" 5. Elemento mayor del array ");
		System.out.println(" 6. Elemento menor del array ");
		System.out.println(" 7. Barajar el array ");
		System.out.println(" 8. Salir ");
		System.out.println("--------");
		System.out.println(" Introduce una opción válida ");
		int op = input.nextInt();

		return op;
	}

	public static int suma(int[] array) {
		int s = 0;

		for (int i = 0; i < 12; i++) {
			s += array[i];
		}
		return s;
	}

	public static int mayor(int[] array) {
		int mayor = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}

	public static int menor(int[] array) {
		int menor = 30;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		return menor;
	}

	public static int[] barajar(int[] array) {

		Random rgen = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomPosition = rgen.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}

		return array;
	}
}