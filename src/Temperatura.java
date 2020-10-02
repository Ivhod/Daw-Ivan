import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		double cel;
		double fah;

		System.out.println("Introduce los grados");
		fah = input.nextDouble();
		
		cel=(5.0/9)*(fah-32);
		
		System.out.println( + fah + " grados Fahrenheit son " + cel + "  grados Celsius ");
		
		
		
	}

}
