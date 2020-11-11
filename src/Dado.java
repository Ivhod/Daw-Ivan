
public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] contador = new int[6]; //creo el contador y 6 espacios para enteros, Los valores estan a 0

		for (int i = 1; i <= 100; i++) {
			int dado = (int) ((Math.random() * 6) + 1);
			contador[dado - 1]++;  //Esto es lo que aumenta el numero de veces que ha salido los numeros
		}

		System.out.println("Resultado de las 100 tiradas");
		for (int i = 0; i < contador.length; i++) {
			System.out.println((i + 1) + "\t" + contador[i] + " veces");
		}
	}

}
