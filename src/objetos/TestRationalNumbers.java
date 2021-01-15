package objetos;

import java.util.Scanner;

public class TestRationalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numerator;
		int denominator;
		
		System.out.println("Introduce el numerador");
		numerator= input.nextInt();
		
		System.out.println("Introduce el denominador");
		denominator= input.nextInt();
		
		RationalNumbers r1= new RationalNumbers (numerator,denominator);
		System.out.println(r1.toString());
		
		RationalNumbers r2= new RationalNumbers (1,2);
		System.out.println(r2.toString());
		
		RationalNumbers r= r1.sumar(r2);
		System.out.println(r.toString());
		
		
	}

}
