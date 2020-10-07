import java.util.Scanner;

public class NumeroResta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = (int)(Math.random()*10);
		
		int numero2 = (int)(Math.random()*10);
		
		Scanner input =new Scanner(System.in);
		
		int resta = numero1 - numero2;
		
		System.out.println(" ¿Cuanto es " + numero1 + " - " + numero2 + "?" );
		
		int resultado = input.nextInt();
		
		if (numero1 > numero2) 
			System.out.println("¿Cuanto es " + numero1 + " - " + numero2 + "?");
		else 
			System.out.println("¿Cuanto es " + numero2 + " - " + numero1 + "?");
		
		if (numero2 > numero1)
			
			System.out.println("¿Cuanto es " + numero2 + " - " + numero1 + "?");
		else 
			System.out.println("¿Cuanto es " + numero1 + " - " + numero2 + "?");
		
	
		
		System.out.println((resta >= resultado));

	}

}
