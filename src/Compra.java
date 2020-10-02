import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		System.out.println("Introduce el precio de tu compra");
		
		double compra= input.nextDouble();
		
		double iva=(compra*20)/100;
		
		double total= (int)((compra+iva)*100)/100;
		
		System.out.println( " Lo que te ratea el estado " + iva );
				

	}

}
