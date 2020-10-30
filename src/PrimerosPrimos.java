import java.util.Scanner;

public class PrimerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Primero 50 numeros primos");

		int numero = 1;
		int contador = 1;
		String report = "\t1";

		while (contador < 50) {
			numero++;
			int divisor = 2;

			while (divisor <= (numero / 2) && (numero % divisor != 0))
				divisor++;

			if (numero % divisor != 0) {
				report += "\t" + numero;
				contador++;
				if (contador % 10 == 0)
					report += "\n";

			}
		}
		System.out.println(report);
	}
}

