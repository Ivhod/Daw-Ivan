import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    System.out.print(" Introducir los intereses del banco ");
	    
	    double interesa�o = input.nextDouble();
	    
	    double interesmensual = interesa�o / 1200;
	    
	    System.out.print(" Introducimos el numero de a�os ");
	    
	    int numeroa�os = input.nextInt();
	    
	    // Enter loan amount
	    System.out.print("Introduce cuanto tienes que pagar");
	    double dinerobanco = input.nextDouble();
	    
	    // Calculate payment
	    double mensualpagado = dinerobanco * interesmensual / (1 - 1 / Math.pow(1 + interesmensual, numeroa�os * 12));
	    
	    double totalpagado = mensualpagado * numeroa�os * 12;

	    // Display results
	    System.out.println(" El pago mensual es $ " + 
	      (int)(mensualpagado * 100) / 100.0);
	    System.out.println("Total pagado es $ " + 
	      (int)(totalpagado * 100) / 100.0);
	    
	    
		

	}

}
