import java.util.Scanner;

public class ProcessingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int op= 0;
		int numero1;
		int numero2;
		Scanner input = new Scanner(System.in);
		
		do {
			op= menu();
			switch (op) {
			case 1:			
				int[] contador = new int[12];
				contador = inicializarArray();
				
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
			
			break;
			
			case 7:
				
				break;
			}
		}while (op!=8);
	}
	public static int[] inicializarArray() {
		System.out.println(" Introduce 12 numeros para inicializar el array ");
		int [] miarray = new int [12];
		return miarray;
	}
	public static int menu() { // este es el menu del programa
		int opciones;
		Scanner input = new Scanner(System.in);
		System.out.println(" Menu ");
		System.out.println(" 1-Inicializa el Array  ");
		System.out.println(" 2-Inicializa el Array con numero aleatorios ");
		System.out.println(" 3-Imprime un Array ");
		System.out.println(" 4-Sumar todos los elementos");
		System.out.println(" 5-Encuentra el valor mas alto ");
		System.out.println(" 6-Encuentra el indice mas pequeño ");
		System.out.println(" 7-Mezcla aleatoria ");
		System.out.println(" 8- Salir del programa ");

		opciones = input.nextInt();
		return opciones;

	}
}
