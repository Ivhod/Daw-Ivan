import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    System.out.print(" Introducir los intereses del banco ");
	    
	    double interesaño = input.nextDouble();
	    
	    double interesmensual = interesaño / 1200;
	    
	    System.out.print(" Introducimos el numero de años ");
	    
	    int numeroaños = input.nextInt();
	    
	   
	    System.out.print("Introduce cuanto tienes que pagar");
	    double dinerobanco = input.nextDouble();
	    
	    
	    double mensualpagado = dinerobanco * interesmensual / (1 - 1 / Math.pow(1 + interesmensual, numeroaños * 12));
	    
	    double totalpagado = mensualpagado * numeroaños * 12;

	    
	    System.out.println(" El pago mensual es $ " + 
	      (int)(mensualpagado * 100) / 100.0);
	    System.out.println("Total pagado es $ " + 
	      (int)(totalpagado * 100) / 100.0);
	    
	    
		

	}

}
