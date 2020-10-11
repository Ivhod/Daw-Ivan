import java.util.Scanner;
public class Divisibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
	    int number = input.nextInt();
	    
	    if (number % 2 == 0 && number % 3 == 0)
	        System.out.println(number + " es divisible por 2 y 3 ");

	      if (number % 2 == 0 || number % 3 == 0)
	        System.out.println(number + " es divisible por 2 o 3 ");

	      if (number % 2 == 0 ^ number % 3 == 0)
	        System.out.println(number + 
	          " es divisible entre el 2 o el 3 pero no por ambos ");

	}

}
