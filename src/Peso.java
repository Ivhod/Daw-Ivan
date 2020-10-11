import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Introduce tu peso en kg");
		
		int peso = input.nextInt();
		
		System.out.println(" Introduce tu altura en m ");
		
		double altura = input.nextDouble();
		
		double bmi= peso/(altura*altura);
		
		System.out.println(" Tu BMI es " + bmi);
	    if (bmi < 18.5)
	      System.out.println("Delgado");
	    else 
	    	if (bmi < 25)
	      System.out.println("Normal");
	    else 
	    	if (bmi < 30)
	      System.out.println("Gordo");
	    else
	      System.out.println("Obeso");

	}

}
