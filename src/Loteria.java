import java.util.Scanner;
public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loteria = (int)(Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
	    System.out.print(" Introduce el numero de la loteria de dos digitos ");
	    int numero = input.nextInt();
	    
	    int loteriadigito1 = loteria / 10;
	    int loteriadigito2 = loteria % 10;
	    
	    int numerodigito1 = numero / 10;
	    int numerodigito2 = numero % 10;
	    
	    System.out.println(" El numero de la loteria " + loteria);
	    
	    if (numero == loteria)
	        System.out.println("Numero exacto €10,000");
	      else if (numerodigito2 == loteriadigito1 && numerodigito1 == loteriadigito2)
	        System.out.println(" Dos numeros son iguales €3,000");
	      else if (numerodigito1 == loteriadigito1 
	            || numerodigito1 == loteriadigito2
	            || numerodigito2 == loteriadigito1 
	            || numerodigito2 == loteriadigito2)
	        System.out.println(" Un numero es igual €1,000");
	      else
	        System.out.println("Lo siento has perdido");
	}

}
